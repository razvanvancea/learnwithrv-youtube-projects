import { Selector } from "testcafe";
import { testcafeAudit } from "testcafe-lighthouse";
// fixture("authentication suite").page("https://qa-automation-practice.netlify.app/login.html");

// prettier-ignore
fixture `authentication suite`.page `https://qa-automation-practice.netlify.app/login.html`
test("login scenario - bad creds", async (t) => {
  const emailField = Selector("#email");
  const pswField = Selector("#password");
  const loginBtn = Selector("#submitLoginBtn");
  const responseMsgElement = Selector("#message");
  const responseSuccessMessage =
    "Bad credentials! Please try again! Make sure that you've registered.";

  await t
    .typeText(emailField, "admin@admin.com")
    .typeText(pswField, "admin123")
    .click(loginBtn)
    .expect(responseMsgElement.innerText)
    .contains(responseSuccessMessage);

  const currentURL = await t.eval(() => document.documentURI);
  await testcafeAudit({
    url: currentURL,
    thresholds: {
      performance: 50,
      accessibility: 50,
      "best-practices": 50,
      seo: 50,
      pwa: 50,
    },
    reports: {
      formats: {
        html: true,
      },
      name: "lighthouseReport",
      directory: "./performance",
    },
    cdpPort: 9222,
  });
});
