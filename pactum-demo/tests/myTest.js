const pactum = require('pactum');
const request = pactum.request;

request.setDefaultTimeout(20000);
request.setBaseUrl('https://qa-practice.herokuapp.com');

it('get all employees test', async () => {
  await pactum.spec()
    .get('/api/v1/employees')
    .expectStatus(200);
});

it('create employee test', async () => {
    const postRequestBody = {
        "dob": "1960-01-01",
        "email": "loremfoo@gmail.com",
        "firstName": "John",
        "lastName": "Cash"
      };

    await pactum.spec()
      .post('/api/v1/employees')
      .withJson(postRequestBody)
      .expectStatus(201);
  });
  