describe("my test suite description", function(){

	it("assert url", function(){
		cy.visit("https://learnwithrv-automation-practice.netlify.app/");
		cy.url().should('contain','learnwithrv');
		cy.get('#dropdowns').click();
	
	})
})