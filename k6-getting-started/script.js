import http from 'k6/http';
import {sleep, check} from 'k6';

// export const options = {
//     vus: 3, 
//     duration: '5s'
// }

const baseUrl = "https://test-api.k6.io";

export default function(){
    
    const resp = http.get(`${baseUrl}/public/crocodiles/`);
    check(resp, {
        'status code 200': r => r.status === 200
    })
};
