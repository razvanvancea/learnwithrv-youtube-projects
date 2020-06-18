import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.config.DriverManagerType.CHROME;


public class SeleniumTest {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){

//        WebDriverManager.chromedriver().browserVersion("81").setup();

//        WebDriverManager.getInstance(CHROME).setup();

        DriverManagerType chrome = CHROME;

        WebDriverManager.getInstance(chrome).setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }

    @Test
    public void assertGoogleTitle(){
        String currentTitle = driver.getTitle();
        String expectedTitle = "Google";

        Assert.assertEquals(currentTitle, expectedTitle);
    }

    @AfterMethod
    public void tearDown(){
        if(driver != null)
        {
            driver.quit();
        }
    }
}
