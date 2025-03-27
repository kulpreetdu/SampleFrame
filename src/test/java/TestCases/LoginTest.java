package TestCases;

import PageObject.LoginPage;
import org.testng.annotations.Test;


public class LoginTest extends BaseClass{

    @Test(priority = 1,groups = "Regression")
    public void log_test_n() throws InterruptedException {
        LoginPage lp= new LoginPage(driver);
        Thread.sleep(2000);
        lp.set_user("Admin");
        Thread.sleep(2000);
        lp.set_pass("admin1234");
        Thread.sleep(2000);
        lp.login_button();
        Thread.sleep(2000);
        lp.invalid_text();
    }

    @Test(priority = 2,groups = "Regression")
    public void log_test_n1() throws InterruptedException {
        LoginPage lp= new LoginPage(driver);
        Thread.sleep(2000);
        lp.set_user("Admin1");
        Thread.sleep(2000);
        lp.set_pass("admin123");
        Thread.sleep(2000);
        lp.login_button();
        Thread.sleep(2000);
        lp.invalid_text();
    }

    @Test(priority = 3,groups = "Regression")
    public void log_test_n2() throws InterruptedException {
        LoginPage lp= new LoginPage(driver);
        Thread.sleep(2000);
        lp.set_user("Admin1");
        Thread.sleep(2000);
        lp.set_pass("admin1234");
        Thread.sleep(2000);
        lp.login_button();
        Thread.sleep(2000);
        lp.invalid_text();
    }

    @Test(priority = 4,groups = "smoke")
    public void log_test() throws InterruptedException {
        LoginPage lp= new LoginPage(driver);
        Thread.sleep(2000);
        lp.set_user("Admin");
        Thread.sleep(2000);
        lp.set_pass("admin123");
        Thread.sleep(2000);
        lp.login_button();
        Thread.sleep(2000);
    }

}
