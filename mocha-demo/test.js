describe('Authentication Feature', ()=>{

    before(()=>{
        //logic that runs ONCE BEFORE all tests
        console.log('before hook');
    })

    beforeEach(()=>{
        // logic that runs BEFORE EACH test
        console.log('beforeEach hook')
    })

    after(()=>{
        // logic that runs ONCE AFTER all tests
        console.log('after - hook');
    })

    afterEach(()=>{
        // logic that runs AFTER EACH test
        console.log('afterEach - hook');
    })


    it('should be able to register', ()=>{
        // test logic here
        console.log('test1 - register');
    })

    it('should be able to login', ()=>{
        // test 2 logic here
        console.log('test2 - login');
    })
})