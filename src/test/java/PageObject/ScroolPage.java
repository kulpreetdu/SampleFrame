package PageObject;

import TestCases.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScroolPage extends BasePage {
    public ScroolPage(WebDriver driver)
    {
        super(driver);
    }

    public void scroll_down()
    {
        JavascriptExecutor jss=(JavascriptExecutor)driver;
        jss.executeScript("window.scrollBy(0,200)","");
        System.out.println(jss.executeScript("return window.pageYOffset"));
    }

    public void scroll_up()
    {
        JavascriptExecutor jss=(JavascriptExecutor)driver;
        jss.executeScript("window.scrollBy(0,-document.body.scrollHeight)","");
        System.out.println(jss.executeScript("return window.pageYOffset"));
    }
}
