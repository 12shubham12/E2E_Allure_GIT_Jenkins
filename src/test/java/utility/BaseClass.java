package utility;

import crm_pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

    public ExcelDataProvider excelDataProvider;
    public ConfigDataProvider config;
    public static WebDriver driver;

    public static LoginPage loginPage;

    @BeforeSuite
    public void setupSuit() {
        excelDataProvider = new ExcelDataProvider();
        config = new ConfigDataProvider();
    }

//For unit testing or single browser testing, where browser is read from config.properties file

    @BeforeClass
    public void browser_launch() {
        driver = BrowserSetup.launchBrowser(driver, config.getBrowser(),
                config.getURL(), false, true);
    }

    //@AfterClass
    //public void browser_termination(){
        //BrowserSetup.quitBrowser(driver);
    //}
}
