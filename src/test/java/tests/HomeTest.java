package tests;

import com.thoughtworks.gauge.Step;
import pageModels.BaseModel;
import pageModels.HomeModel;

public class HomeTest {

    HomeModel homeModel;
    BaseModel baseModel;

    public HomeTest() {
        homeModel = new HomeModel();
        baseModel = new BaseModel();
    }

    @Step("<key> sitesi açılır")
    public void goToUrl(String key) throws Exception {
        homeModel.goToUrl(key);
    }

    @Step("Ana sayfanın açıldığı kontrol edilir")
    public void controlTheLink() {
        homeModel.controlTheLink();
    }
}
