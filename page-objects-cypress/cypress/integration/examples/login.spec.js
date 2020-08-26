import HomePage from "../../elements/pages/HomePage";
import LoginPage from "../../elements/pages/LoginPage";

describe("user actions suite", function () {
  it("login scenario", function () {
    let homePage = new HomePage();
    let loginPage = new LoginPage();
    cy.visit("https://qa-automation-practice.netlify.app");

    homePage.getFormsSideMenu().click();
    homePage.getLoginSideMenu().click();

    loginPage.getEmailField().type("admin@admin.com");
    loginPage.getPasswordField().type("admin123");
    loginPage.getSubmitBtn().click();
  });
});
