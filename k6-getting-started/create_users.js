import http from 'k6/http';
import {sleep, check} from 'k6';

import { randomString } from 'https://jslib.k6.io/k6-utils/1.2.0/index.js';

export const options = {
    vus: 3, 
    duration: '5s'
}

const baseUrl = "https://test-api.k6.io";

export default function(){
    const randomUsername = randomString(16);

    const requestBody = JSON.stringify({
        "username": randomUsername,
        "first_name": "John",
        "last_name": "Doe",
        "email": randomUsername+"@gmail.com",
        "password": "123123123"
    });

    const params = {
        headers: {
            "Content-Type": "application/json"
        }
    }
    const resp = http.post(`${baseUrl}/user/register/`,requestBody,params);

    check(resp, {
        'status code 201': r => r.status === 201
    })

    console.log(resp);
};
