import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Demo {

    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions opt = new ChromeOptions();
        opt.setHeadless(true);

        driver = new ChromeDriver(opt);
        driver.get("https://qa-automation-practice.netlify.app/");

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void assertTitle(){
        String currentTitle = driver.getTitle();
        String expectedTitle = "RV";

        Assert.assertTrue(currentTitle.contains(expectedTitle));
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
