package crm_tests;

import crm_pages.LoginPage;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.BaseClass;

public class LoginTest extends BaseClass {

    @Test
    public void test_login(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.doLogin("amit", "amit_pass");

    }

    @Attachment(value="{0}", type="image/png")
    public byte[] takeScreenshot(String name){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
