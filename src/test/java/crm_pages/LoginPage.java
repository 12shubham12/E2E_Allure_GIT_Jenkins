package crm_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath="//input[@name='username']") WebElement username;
    @FindBy(xpath="//input[@name='password']") WebElement password;
    @FindBy(xpath="//input[@value='Log In']") WebElement loginButton;

    public void doLogin(String user_name, String pass_word){
        username.sendKeys(user_name);
        password.sendKeys(pass_word);
        loginButton.click();
    }
}
