const { spec } = require('pactum');

describe('Users test suite', ()=>{
it('should get random users1', async () => {
  await spec()
    .get('https://randomuser.me/api');
});

it('should get random users2', async () => {
  await spec()
    .get('https://randomuser.me/api');
});

it('should get random users- fails', async () => {
  await spec()
    .get('https://randomuser.me/api').expectStatus(500);
});
})
