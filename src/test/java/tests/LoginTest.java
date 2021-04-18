package tests;

import com.thoughtworks.gauge.Step;
import pageModels.LoginModel;

public class LoginTest {

    LoginModel loginModel;

    public LoginTest() {
        loginModel = new LoginModel();
    }

    @Step("<key> login sayfasına gidilir")
    public void GoToLoginUrl(String url) {
        loginModel.goToLoginUrl(url);
    }

    @Step("Kullanıcı Adı alanına <key> girilir")
    public void SetUserName(String userName) {
        loginModel.SetUserName(userName);
    }

    @Step("Şifre alanına <key> girilir")
    public void SetPassword(String password) {
        loginModel.SetPassword(password);
    }

    @Step("Giriş Yap butonuna tıklanır")
    public void ClickLoginButton() {
        loginModel.ClickLoginButton();
    }

    @Step("Login işlemi kontrol edilir")
    public void CheckLogin() {
        loginModel.CheckLogin();
    }
}
