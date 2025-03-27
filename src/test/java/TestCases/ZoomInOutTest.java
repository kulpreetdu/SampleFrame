package TestCases;

import PageObject.LoginPage;
import PageObject.ZoomInoutPage;
import org.testng.annotations.Test;

public class ZoomInOutTest extends BaseClass{

    @Test(priority = 1,groups = "smoke")
    public void login_emp_zoom() throws InterruptedException {
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
    public void testzoomout() throws InterruptedException {
        ZoomInoutPage zp= new ZoomInoutPage(driver);
        Thread.sleep(2000);
        zp.zoomout();
        Thread.sleep(2000);
    }

    @Test(priority = 3,groups = "smoke")
    public void testzoomin() throws InterruptedException {
        ZoomInoutPage zp= new ZoomInoutPage(driver);
        Thread.sleep(2000);
        zp.zoomin();
        Thread.sleep(2000);
    }

}
