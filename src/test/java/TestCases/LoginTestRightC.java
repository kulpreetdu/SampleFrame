package TestCases;

import PageObject.LoginRight;
import org.testng.annotations.Test;

public class LoginTestRightC extends BaseClass{

    @Test(priority = 1,groups = "smoke")
    public void riclick() throws InterruptedException {
        LoginRight lr = new LoginRight(driver);
        Thread.sleep(2000);
        lr.right_click();
        Thread.sleep(2000);
    }

    @Test(priority = 2,groups = {"smoke","Regression"})
    public void riclickele() throws InterruptedException {
        LoginRight lr = new LoginRight(driver);
        Thread.sleep(2000);
        lr.right_click_ele();
        Thread.sleep(2000);
    }
}
