package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends  BasePage{


    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='username']") WebElement user_nm;
    @FindBy(xpath = "//input[@name='password']") WebElement user_pass;
    @FindBy(xpath = "//button[@type='submit']") WebElement login_btn;
    @FindBy(xpath = "(//div[@role='alert']/div)[1]") WebElement inv_text;

    public void set_user(String user)
    {
        user_nm.sendKeys(user);
    }

    public void set_pass(String pass)
    {
        user_pass.sendKeys(pass);
    }


    public void login_button()
    {
        login_btn.click();
    }

    public void invalid_text()
    {
        String intext=inv_text.getText();
        if(intext.equals("Invalid credentials"))
        {
            System.out.println("The test case is invalid");
        }
        else
        {
            System.out.println("The test case is valid");
        }
    }
}
