describe("user actions test suite", function () {
  beforeEach(function () {
    cy.visit("https://qa-automation-practice.netlify.app");
    cy.get("#forms").click();
  });

  it("register scenario", function () {
    cy.get("#register").click();
    cy.get("#firstName").type("Razvan");
    cy.get("#lastName").type("Van");
    cy.get("#phone").type("0799876567");
    cy.get("#countries-dropdown-menu").select("Romania");
    cy.get("#emailAddress").type("iamrazvan@gmail.com");
    cy.get("#password").type("123456");
    cy.get("#exampleCheck1").check().should("be.checked");
    cy.get("#registerBtn").click();
    cy.get("#message").should(
      "contain",
      "The account has been successfully created!"
    );
  });
});
