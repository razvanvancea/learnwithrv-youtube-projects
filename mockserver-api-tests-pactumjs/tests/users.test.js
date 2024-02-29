const {spec, request} = require('pactum');
const {startServer, stopServer} = require('../utils/server');

describe("user test suite", () => {
    before(async () => {
        await startServer(3001, "127.0.0.1");
    })

    it("get users test", async () => {
        await spec().get('http://127.0.0.1:3001/api/users').expectStatus(200);
    })

    after(async () => {
        await stopServer();
    })
})