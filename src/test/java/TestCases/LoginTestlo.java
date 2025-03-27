package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObject.LoginPagelo;

public class LoginTestlo extends BaseClass{


    @Test(priority = 1,groups = "smoke")
    public void testlogo() throws InterruptedException
    {
        LoginPagelo lpl= new LoginPagelo(driver);
        lpl.logo();
    }

    @Test(priority = 2,groups = "Regression")
    public void testAppUrl()
    {
        LoginPagelo lpla= new LoginPagelo(driver);
        lpla.appUrl();
    }

    @Test(priority = 3, groups = "Regression")
    public void testhomepage()
    {
        LoginPagelo lplh= new LoginPagelo(driver);
        lplh.homepage();
    }
}
