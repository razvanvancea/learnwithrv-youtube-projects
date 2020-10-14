export default class HomePage {
  getFormsSideMenu() {
    return cy.get("#forms");
  }

  getLoginSideMenu() {
    return cy.get("#login");
  }
}
