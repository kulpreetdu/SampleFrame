package TestCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {

    WebDriver driver;
    public Properties p;

    @BeforeClass(groups = {"smoke","Regression"})
    @Parameters({"os","browser"})
    public void setUp(String os, String br) throws IOException {
        //loading config.properties file
        FileReader file= new FileReader("./src//main//resources//config.properties");
        p= new Properties();
        p.load(file);

        switch(br.toLowerCase())
        {
            case "chrome" : driver= new ChromeDriver(); break;
            case "edge"  : driver= new EdgeDriver(); break;
            default: System.out.println("invalid browser name"); return;
        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.get(p.getProperty("appUrl"));
        driver.manage().window().maximize();
    }

    @AfterClass(groups = {"smoke","Regression"})
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);
    }

    public String randstr()
    {
        String rndst=RandomStringUtils.randomAlphabetic(4);
        return rndst;
    }

    public String randnum()
    {
        String rndnm=RandomStringUtils.randomNumeric(5);
        return rndnm;
    }



}
