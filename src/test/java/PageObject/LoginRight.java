package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginRight extends BasePage{

    public LoginRight(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//input[@name='username']")  WebElement user_nm;

    public void right_click() throws InterruptedException {
        Actions act= new Actions(driver);
        Thread.sleep(2000);
        act.contextClick().perform();
    }

    public void right_click_ele() throws InterruptedException {

        Actions act= new Actions(driver);
        Thread.sleep(2000);
        act.contextClick(user_nm).perform();
    }
}
