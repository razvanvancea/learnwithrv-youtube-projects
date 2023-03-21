const { spec } = require('pactum');

it('should get random users', async () => {
  await spec()
    .get('https://randomuser.me/api');
});