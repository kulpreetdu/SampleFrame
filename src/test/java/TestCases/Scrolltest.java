package TestCases;

import PageObject.LoginPage;
import PageObject.ScroolPage;
import PageObject.ZoomInoutPage;
import org.testng.annotations.Test;

public class Scrolltest extends BaseClass{

    @Test(priority = 1,groups = "smoke")
    public void login_emp_sc() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        Thread.sleep(2000);
        lp.set_user("Admin");
        Thread.sleep(2000);
        lp.set_pass("admin123");
        Thread.sleep(2000);
        lp.login_button();
        Thread.sleep(2000);
    }

    @Test(priority = 2,groups = "smoke")
    public void testscdow() throws InterruptedException {
        ScroolPage sp= new ScroolPage(driver);
        Thread.sleep(2000);
        sp.scroll_down();
        Thread.sleep(2000);
    }

    @Test(priority = 3,groups = "smoke")
    public void testscup() throws InterruptedException {
        ScroolPage sp= new ScroolPage(driver);
        Thread.sleep(2000);
        sp.scroll_up();
        Thread.sleep(2000);
    }

}
