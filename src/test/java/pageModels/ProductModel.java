package pageModels;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductModel extends BaseModel {

    @FindBy(xpath = "//*[@id='main-header']/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input")
    public WebElement txtSearchBar;

    @FindBy(xpath = "//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button/span")
    public WebElement btnFind;

    @FindBy(xpath = "//*[@id='best-match-right']/div[5]/ul/li[2]/a")
    public WebElement btnSecondPage;

    public void SetSearchComputer(String computer) {
        txtSearchBar.sendKeys(computer);
    }

    public void ClickFindButton() {
        btnFind.click();
    }

    public void scrollToSecondPageElement(){
        ((JavascriptExecutor) webDriver).executeScript("scroll(0,9000)");
        btnSecondPage.click();
    }

    public void CheckSecondPage() {
        if (webDriver.getCurrentUrl().contains("sf=2")) {
            System.out.println("2. sayfa açılmıştır.");
            System.out.println("-----------------------------");

        } else {
            System.out.println("2. sayfa açılamadı.");
        }
    }

    public List getAllItemsByCss(String selector) {
        List<WebElement> itemList = new ArrayList();
        itemList = webDriver.findElements(By.cssSelector(selector));
        return itemList;

    }

    public WebElement SelectRandomProduct() {
        List<WebElement> list = getAllItemsByCss("li[product-index]");
        int listCount = list.toArray().length;

        Random random = new Random();
        int result = random.nextInt(listCount) + 1; //first product id = 1
        return list.get(result);
    }

    public void ProductQuantity() throws InterruptedException {
        WebElement productQuantity = webDriver.findElement(By.xpath(
                "//body/div[@id='main-content']/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[6]/div[2]/div[2]/div[4]/div[1]/div[2]/select[1]"));
        productQuantity.click();
        productQuantity.sendKeys("2");
        productQuantity.sendKeys(Keys.ENTER);
        wait(20);
    }

    WebElement productPriceInDetails = webDriver.findElement(By.xpath("/html//div[@id='sp-price-lowPrice']"));
    String listPrice = productPriceInDetails.getText();
    public void CheckProduct() {
        WebElement productPriceInBasket = webDriver.findElement(By.xpath(".//*[@id='cart-price-container']/div[3]/p"));
        String basketPrice = productPriceInBasket.getText();
        Assert.assertEquals(listPrice, basketPrice);
        System.out.println("Ürünün listedeki fiyatı ile sepetteki fiyatı eşit ve " + basketPrice + "'dir.");
        System.out.println("-----------------------------");
    }

    public void DeleteProduct() {
        webDriver.findElement(By.xpath(
                "/html//div[@id='cart-items-container']/div[@class='products-container']/div/div//div[@class='row']/a[@title='Sil']/i[@class='gg-icon gg-icon-bin-medium']"))
                .click();
    }

    public void CloseWindow() {
        webDriver.quit();
    }
}
