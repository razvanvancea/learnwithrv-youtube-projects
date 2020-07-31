describe("login test suite", function () {
  beforeEach(function () {
    cy.visit("https://qa-automation-practice.netlify.app");
    cy.get("#forms").click();
  });

  it("login", function () {
    cy.get("#login").click();
    cy.get("#email").type("admin@admin.com");
    cy.get("#password").type("admin123");
    cy.get("#submitLoginBtn").click();
    cy.get("#message").should("contain", "You have successfully logged in!");
  });
});
