import { Selector } from "testcafe";
// fixture("authentication suite").page("https://qa-automation-practice.netlify.app/login.html");

// prettier-ignore
fixture `authentication suite`.page `https://qa-automation-practice.netlify.app/login.html`
test("login scenario", async (t) => {
  const emailField = Selector("#email");
  const pswField = Selector("#password");
  const loginBtn = Selector("#submitLoginBtn");
  const responseMsgElement = Selector("#message");
  const responseSuccessMessage = "You have successfully logged in";

  await t
    .typeText(emailField, "admin@admin.com")
    .typeText(pswField, "admin123")
    .click(loginBtn)
    .expect(responseMsgElement.innerText)
    .contains(responseSuccessMessage);
});
