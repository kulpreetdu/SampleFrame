package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMPage_img extends BasePage {

    public PIMPage_img(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "(//button[@type='button'])[4]")  WebElement img_up;

    public void upl_img() throws InterruptedException {
        Thread.sleep(2000);
        img_up.sendKeys("C:\\Users\\singh\\Downloads\\testimg.jpg");
    }
}
