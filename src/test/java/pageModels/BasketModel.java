package pageModels;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketModel extends BaseModel {

    @FindBy(xpath = "/html//button[@id='add-to-basket']")
    public WebElement btnBasket;

    @FindBy(xpath = "/html//div[@id='header_wrapper']/div/div/div//div[@class='gg-d-12 pl0']/a[@href='https://www.gittigidiyor.com/sepetim']")
    public WebElement basketPage;

    public void AddItemToBasket() {
        ((JavascriptExecutor) webDriver).executeScript("scroll(0,350)");
        btnBasket.click();
    }

    public void GoToBasketUrl() {
        basketPage.click();
    }
}
