package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPagelo extends BasePage {

    public LoginPagelo(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='orangehrm-login-branding']/img")  WebElement tlogo;

    public void logo() throws InterruptedException {
        Thread.sleep(2000);
        //System.out.println("the logo displayed is correct");
        boolean sts = tlogo.isDisplayed();
        //boolean sts = driver.findElement(By.xpath("//a[@class='navbar-brand']")).isDisplayed();
        if (sts == true) {
            System.out.println("the logo displayed is correct");
        } else {
            System.out.println("theblogo dispalyed is not correct");
        }
        //Assert.assertEquals(sts,true);
    }

    public void appUrl() {
        if (driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
            System.out.println("the url is correct");
        } else {
            System.out.println("the url is incorrect");
        }
    }

    public void homepage() {
        if (driver.getTitle().equals("OrangeHRM")) {
            System.out.println("the title is correct");
        } else {
            System.out.println("Title is incorrect");
        }
    }
}