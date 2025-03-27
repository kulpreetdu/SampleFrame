package TestCases;

import PageObject.LoginPage;
import PageObject.PIMPage;
import PageObject.PIMPage_img;
import org.testng.annotations.Test;

import java.time.Duration;

public class PIM_img extends  BaseClass{

    @Test(priority = 1,groups = "smoke")
    public void login_emp_img() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        Thread.sleep(2000);
        lp.set_user("Admin");
        Thread.sleep(2000);
        lp.set_pass("admin123");
        Thread.sleep(2000);
        lp.login_button();
        Thread.sleep(2000);
    }

    @Test(priority = 2, groups = {"smoke","Regression"})
    public void test_up_img() throws InterruptedException {
        PIMPage pg = new PIMPage(driver);
        pg.panel_pim();
        Thread.sleep(2000);
        pg.add_emp_side();
        Thread.sleep(2000);
        pg.first_name("fn3");
        Thread.sleep(2000);
        pg.last_name("ln3");
        Thread.sleep(2000);
        pg.emp_id("0"+randnum());
        Thread.sleep(4000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        PIMPage_img pgim= new PIMPage_img(driver);
        Thread.sleep(4000);
        pgim.upl_img();
        Thread.sleep(2000);
        pg.sub_btn();
        Thread.sleep(2000);
    }

    @Test(priority = 3, groups = {"smoke","Regression"})
    public void test_up_img_de() throws InterruptedException {
        PIMPage pg = new PIMPage(driver);
        pg.add_emp_side();
        Thread.sleep(2000);
        pg.first_name("fn4");
        Thread.sleep(2000);
        pg.last_name("fn4");
        Thread.sleep(2000);
        pg.emp_id("0"+randnum());
        Thread.sleep(2000);
        PIMPage_img pgim= new PIMPage_img(driver);
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        pgim.upl_img();
        Thread.sleep(4000);
        pg.cr_log_detail();
        pg.user_name("user_"+randstr());
        Thread.sleep(2000);
        String passw='T'+randstr()+'@'+randnum();
        //System.out.println(passw);
        pg.pass_name(passw);
        Thread.sleep(2000);
        pg.con_pass_name(passw);
        pg.sub_btn();
        Thread.sleep(2000);
    }
}
