import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UserAction {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com");
    }

    @Test
    public void createAccountTest(){

        WebElement signInBtn = driver.findElement(By.xpath("//a[@class='login']"));
        signInBtn.click();

        WebElement emailField = driver.findElement(By.xpath("//input[@id='email_create']"));
        emailField.sendKeys("testtestjohndoe@gmail.com");

        WebElement createAccountBtn = driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]"));
        createAccountBtn.click();

//        Personal info section

        WebElement firstName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        firstName.sendKeys("Michael");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        lastName.sendKeys("Anderson");

        WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
        password.sendKeys("12345");

//        Address section

        WebElement addressFirstName = driver.findElement(By.xpath("//input[@id='firstname']"));
        addressFirstName.sendKeys("Michael");

        WebElement addressLastName = driver.findElement(By.xpath("//input[@id='lastname']"));
        addressLastName.sendKeys("Anderson");

        WebElement addressField = driver.findElement(By.xpath("//input[@id='address1']"));
        addressField.sendKeys("Roses, 65");

        WebElement cityField = driver.findElement(By.xpath("//input[@id='city']"));
        cityField.sendKeys("New York");

        Select state = new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
        state.selectByVisibleText("New York");

        WebElement zipCode = driver.findElement(By.xpath("//input[@id='postcode']"));
        zipCode.sendKeys("12345");

        Select country = new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
        country.selectByVisibleText("United States");

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
        phoneNumber.sendKeys("0765455656");

        WebElement addressAliasField = driver.findElement(By.xpath("//input[@id='alias']"));
        addressAliasField.sendKeys("My super address");

        WebElement registerBtn = driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        registerBtn.click();

        WebElement signOutBtn = driver.findElement(By.xpath("//a[@class='logout']"));

        Assert.assertTrue(signOutBtn.isDisplayed());
    }

    @Test
    public void loginTest(){
        WebElement signInBtn = driver.findElement(By.xpath("//a[@class='login']"));
        signInBtn.click();

        WebElement emailAddress = driver.findElement(By.xpath("//input[@id='email']"));
        emailAddress.sendKeys("testjohndoe@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
        password.sendKeys("12345");

        WebElement loginBtn = driver.findElement(By.xpath("//p[@class='submit']//span[1]"));
        loginBtn.click();

        WebElement signOutBtn = driver.findElement(By.xpath("//a[@class='logout']"));

        Assert.assertTrue(signOutBtn.isDisplayed());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
