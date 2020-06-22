import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Demo extends BaseTest{

    //    scroll into a web page using specific number of pixels - vertical
    @Test
    public void verticalScrollBySpecificNumberOfPixels() {
        jse.executeScript("window.scrollBy(0, 1000)"); //1000 pixels - vertical
    }

    //    scroll into a web page using specific number of pixels - horizontal
    @Test
    public void horizontalScrollBySpecificNumberOfPixels() {
        jse.executeScript("window.scrollBy(1000, 0)"); // 1000 pixels - horizontal
    }

    //    scroll into a web page to reach certain visible web element
    @Test
    public void scrollToCertainElement() {
        WebElement paragraph = driver.findElement(By.id("final"));

        jse.executeScript("arguments[0].scrollIntoView();", paragraph);
    }

    //    scroll into a web page to reach the bottom of the page
    @Test
    public void scrollToBottomPage() {
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    //    horizontal scrolling
    @Test
    public void horizontalScrolling() {
        WebElement rightElement = driver.findElement(By.xpath("/html/body/div/div[2]/p"));

        jse.executeScript("arguments[0].scrollIntoView();", rightElement);
    }
}
