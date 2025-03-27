package TestCases;

import PageObject.LoginPage;
import PageObject.PIMPage;
import org.testng.annotations.Test;

public class PIM_Test  extends  BaseClass{

    @Test(priority = 1,groups = "smoke")
    public void login_emp() throws InterruptedException {
        LoginPage lp = new LoginPage(driver);
        Thread.sleep(2000);
        lp.set_user("Admin");
        Thread.sleep(2000);
        lp.set_pass("admin123");
        Thread.sleep(2000);
        lp.login_button();
        Thread.sleep(2000);
    }

    @Test(priority = 2,groups = "Regression")
    public void add_emp() throws InterruptedException {
        PIMPage pg= new PIMPage(driver);
        pg.panel_pim();
        Thread.sleep(2000);
        pg.add_emp_side();
        //String fnm=randstr();
        pg.first_name("fnm1");
        Thread.sleep(2000);
        //String lnm= "l"+randstr();
        pg.last_name("lnm1");
        pg.emp_id("0"+randnum());
        Thread.sleep(2000);
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
        //pg.emp_list_side();
        Thread.sleep(2000);
        //pg.t_mess();
        Thread.sleep(2000);
    }

    @Test(priority = 3,groups="Regression")
    public void add_emp_wot_log() throws InterruptedException {
        PIMPage pg = new PIMPage(driver);
        //pg.panel_pim();
        //Thread.sleep(2000);
        pg.add_emp_side();
        Thread.sleep(2000);
        pg.first_name("fn2");
        Thread.sleep(2000);
        pg.last_name("lnm2");
        Thread.sleep(2000);
        pg.emp_id("0"+randnum());
        Thread.sleep(2000);
        pg.sub_btn();
        Thread.sleep(2000);
    }
}
