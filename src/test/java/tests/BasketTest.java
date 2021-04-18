package tests;

import com.thoughtworks.gauge.Step;
import pageModels.BasketModel;

public class BasketTest {

    BasketModel basketModel;

    public BasketTest() {
        basketModel = new BasketModel();
    }

    @Step("Ürün sepete eklenir")
    public void AddItemToBasket() {
        basketModel.AddItemToBasket();
    }

    @Step("Sepetim sayfasına geri dönülür")
    public void GoToBasketUrl() {
        basketModel.GoToBasketUrl();
    }
}
