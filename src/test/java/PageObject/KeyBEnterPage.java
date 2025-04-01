package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class KeyBEnterPage extends BasePage{
    public KeyBEnterPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='username']")  WebElement user_nm;


    public void kebenter() throws InterruptedException {
        Actions act = new Actions(driver);
        Thread.sleep(2000);
        user_nm.click();
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        act.keyDown(Keys.CONTROL).sendKeys("d").keyUp(Keys.CONTROL).perform();
        Thread.sleep(2000);
        act.keyDown(Keys.CONTROL).sendKeys("m").keyUp(Keys.CONTROL).perform();
        act.keyDown(Keys.CONTROL).sendKeys("i").keyUp(Keys.CONTROL).perform();
        Thread.sleep(2000);
        act.keyDown(Keys.CONTROL).sendKeys("n").keyUp(Keys.CONTROL).perform();
        System.out.println("username value is");
    }
}
