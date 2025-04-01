package PageObject;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class LoginScreenPage extends BasePage{
    public LoginScreenPage(WebDriver driver)
    {
        super(driver);
    }

    public void lscreen() throws InterruptedException {
        TakesScreenshot ts= (TakesScreenshot)driver;
        Thread.sleep(2000);
        File source=ts.getScreenshotAs(OutputType.FILE);
        Thread.sleep(2000);
        File target= new File(System.getProperty("user.dir")+"\\fullpage.png");
        Thread.sleep(2000);
        source.renameTo(target);
        Thread.sleep(2000);
    }
}
