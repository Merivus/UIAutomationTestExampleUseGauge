package pageModels;

import org.openqa.selenium.WebDriverException;
import tests.HomeTest;

public class HomeModel extends BaseModel {

    public void goToUrl(String key){
        webDriver.get(key);
    }

    public void controlTheLink() {
        if (webDriver.getCurrentUrl().contains("https://www.gittigidiyor.com/")) {
            System.out.println("GittiGidiyor sayfası açıldı.");
            System.out.println("-----------------------------");
        } else {
            throw new WebDriverException("GittiGidiyor sayfası açılamadı.");
        }
    }
}
