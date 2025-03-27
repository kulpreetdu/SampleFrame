package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PIMPage extends BasePage {

    public PIMPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='PIM']")  WebElement pan_pim;
    @FindBy(xpath = "//a[text()='Employee List']") WebElement emplist;
    @FindBy(xpath = "//a[text()='Add Employee']") WebElement addemp;
    @FindBy(xpath = "//input[@name='firstName']") WebElement first_nm;
    @FindBy(xpath = "//input[@name='middleName']") WebElement middle_nm;
    @FindBy(xpath = "//input[@name='lastName']") WebElement last_nm;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]") WebElement empid;
    @FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']") WebElement crlog_det;
    @FindBy(xpath = "//button[@type='submit']") WebElement sub_button;
    @FindBy(xpath = "(//button[@type='button'])[5]") WebElement can_button;
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]") WebElement user_nm;
    @FindBy(xpath = "(//input[@type='password'])[1]") WebElement pass_nm;
    @FindBy(xpath = "(//input[@type='password'])[2]") WebElement con_pass_nm;
    @FindBy(xpath="(//h6)[2]") WebElement t_msg;

    public void panel_pim()
    {
        pan_pim.click();
    }

    public void emp_list_side()
    {
        emplist.click();
    }

    public void add_emp_side()
    {
        addemp.click();
    }

    public void first_name(String fname)
    {
        first_nm.sendKeys(fname);
    }

    public void middle_name(String mname)
    {
        middle_nm.sendKeys(mname);
    }

    public void last_name(String lname)
    {
        last_nm.sendKeys(lname);
    }

    public void emp_id(String id)
    {
        empid.clear();
        empid.sendKeys(id);
    }

    public void cr_log_detail()
    {
        crlog_det.click();
    }

    public void sub_btn()
    {
        sub_button.click();
    }

    public void can_btn()
    {
        can_button.click();
    }

    public void user_name(String u_nm)
    {
        user_nm.sendKeys(u_nm);
    }

    public void pass_name(String p_nm)
    {
        pass_nm.sendKeys(p_nm);
    }

    public void con_pass_name(String c_nm)
    {
        con_pass_nm.sendKeys(c_nm);
    }

    public String message()
    {
        String text_msg=t_msg.getText();
        return text_msg;
    }

    public void t_mess()
    {

        if(message().equals("fnm1 lnm1"))
        {
            System.out.println("The emp is added successfully");
        }
        else {
            System.out.println("the emp is not added successfully");
        }
    }
}
