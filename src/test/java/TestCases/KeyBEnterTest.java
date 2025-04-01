package TestCases;

import PageObject.KeyBEnterPage;
import PageObject.LoginPage;
import PageObject.LoginPagelo;
import org.testng.annotations.Test;

public class KeyBEnterTest extends BaseClass {

    @Test(priority = 1,groups = "smoke")
    public void keyenter() throws InterruptedException {
        KeyBEnterPage kp= new KeyBEnterPage(driver);
        Thread.sleep(2000);
        kp.kebenter();
        Thread.sleep(2000);
        LoginPage lp= new LoginPage(driver);
        Thread.sleep(2000);
        lp.set_pass("admin123");
        Thread.sleep(2000);
        lp.login_button();
        Thread.sleep(4000);
        /*
        LoginPagelo lo= new LoginPagelo(driver);
        Thread.sleep(2000);
        lo.homepage();
        Thread.sleep(2000);
        */
    }
}
