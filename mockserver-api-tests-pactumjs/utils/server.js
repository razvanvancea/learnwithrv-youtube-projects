const {mock} = require('pactum');

async function startServer(port, host){
    mock.addInteraction({
        request: {
            method: "GET",
            path: "/api/users"
        }, response: {
            status: 200,
            body: [
                {
                    "email": "iamqarv@gmail.com"
                },
                {
                    "email": "johndoe@gmail.com"
                }
            ]
        }
    })
    mock.start(port, host)
}

async function stopServer(){
    await mock.stop();
}

module.exports = {
    startServer, stopServer
}