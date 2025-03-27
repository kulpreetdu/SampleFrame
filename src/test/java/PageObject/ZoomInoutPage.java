package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ZoomInoutPage extends BasePage{

    public  ZoomInoutPage(WebDriver driver)
    {
        super(driver);
    }

    public void zoomout() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("document.body.style.zoom='50%'");
        Thread.sleep(2000);
    }

    public void zoomin() throws InterruptedException {
        JavascriptExecutor js= (JavascriptExecutor)driver;
        Thread.sleep(2000);
        js.executeScript("document.body.style.zoom='100%'");
        Thread.sleep(2000);
    }
}
