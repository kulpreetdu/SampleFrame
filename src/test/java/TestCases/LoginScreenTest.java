package TestCases;

import PageObject.LoginScreenPage;
import org.testng.annotations.Test;

public class LoginScreenTest extends BaseClass{

    @Test(priority = 1, groups = "smoke")
    public void take_sc() throws InterruptedException {
        LoginScreenPage ls= new LoginScreenPage(driver);
        Thread.sleep(2000);
        ls.lscreen();
    }
}
