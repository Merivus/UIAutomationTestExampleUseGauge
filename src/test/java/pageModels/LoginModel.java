package pageModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginModel extends BaseModel {

    @FindBy(xpath = "//*[@id='L-UserNameField']")
    public WebElement txtUserName;

    @FindBy(xpath = "//*[@id='L-PasswordField']")
    public WebElement txtPassword;

    @FindBy(xpath = "//*[@id='gg-login-enter']")
    public WebElement btnLogin;

    public void goToLoginUrl(String key) {
        webDriver.navigate().to("https://www.gittigidiyor.com/uye-girisi");
    }

    public void SetUserName(String userName) {
        txtUserName.sendKeys(userName);
    }

    public void SetPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void ClickLoginButton() {
        btnLogin.click();
    }

    public void CheckLogin() {
        if (webDriver.getCurrentUrl().contains("https://www.gittigidiyor.com")) {
            System.out.println("GittiGidiyor sitesine login işlemi gerçekleşmiştir.");
            System.out.println("-----------------------------");
        } else {
            throw new WebDriverException("GittiGidiyor sitesine login olunamadı.");
        }
    }
}
