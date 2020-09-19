import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Demo {

    WebDriver driver;
    static final String APP_URL = "https://qa-automation-practice.netlify.app/";
    static final String HOST_URL = "http://localhost:4444/wd/hub";

    @BeforeMethod
    public void setUp(){
        ChromeOptions opt = new ChromeOptions();
        try {
            driver = new RemoteWebDriver(new URL(HOST_URL), opt);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(APP_URL);
    }

    @Test
    public void assertTitle(){
        String expectedTitle = "Learn with";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }

    @AfterMethod
    public void tearDown(){
        if(driver != null) {
            driver.quit();
        }
    }
}
