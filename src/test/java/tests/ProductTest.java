package tests;

import com.thoughtworks.gauge.Step;
import pageModels.ProductModel;

public class ProductTest {

    ProductModel productModel;

    public ProductTest() {
        productModel = new ProductModel();
    }

    @Step("Arama alanına <key> girilir")
    public void SetSearchComputer(String computer) {
        productModel.SetSearchComputer(computer);
    }

    @Step("Bul butonuna tıklanır")
    public void ClickFindButton() {
        productModel.ClickFindButton();
    }

    @Step("Arama sonuçları sayfasından 2. sayfa açılır")
    public void scrollToElement() throws Exception {
        productModel.scrollToSecondPageElement();
    }

    @Step("2. sayfanın açıldığı kontrol edilir")
    public void CheckSecondPage() {
        productModel.CheckSecondPage();
    }

    @Step("Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir")
    public void SelectRandomProduct() {
        productModel.SelectRandomProduct();
    }

    @Step("Adet arttırılarak ürün adedinin 2 olduğu doğrulanır")
    public void ProductQuantity() throws InterruptedException {
        productModel.ProductQuantity();
    }

    @Step("Ürünün listelenen fiyatı ile sepetteki fiyatı kontrol edilir")
    public void CheckProduct() {
        productModel.CheckProduct();
    }

    @Step("Ürün sepetten silinerek sepetin boş olduğu kontrol edilir")
    public void DeleteProduct() {
        productModel.DeleteProduct();
    }

    @Step("Pencere kapatılır")
    public void CloseWindow() {
        productModel.CloseWindow();
    }
}
