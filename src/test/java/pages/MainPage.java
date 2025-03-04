package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import net.nosma.Main;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private final SelenideElement
        toProfile = $("[data-qa='HEADER_PROFILE']"),
        loginRegistrationText = $("[data-qa='VLOGIN_REGISTRATION_BAR_DESCRIPTION']"),
        toLogin = $("[data-qa='VLOGIN_REGISTRATION_BAR_LOGIN_LINK']"),
        btnCart = $(".cart-button-img"),
        btnMakeOrder = $("[data-qa='MAKE_ORDER']"),
        toCart = $(".header__cart .cart-bar__icon");

    @Step("Open main page")
    public MainPage openPage(String value) {
        open(value);
        return this;
    }

    @Step("Open profile bar")
    public MainPage openProfileBar() {
        toProfile.click();
        return this;
    }

    @Step("Check opening profile bar")
    public  MainPage checkDescriptionProfileBar() {
        loginRegistrationText.shouldHave(text("Войдите или зарегистрируйтесь в Siberian Wellness"));
        return this;
    }

    @Step("Open login page")
    public MainPage openLoginPage() {
        toLogin.click();
        return this;
    }

    @Step("add item to cart")
    public MainPage addItemToCart() {
        btnCart.click();
        return this;
    }

    @Step("Open cart")
    public MainPage clickByCart() {
        toCart.click();
        return this;
    }

    @Step("Make order")
    public MainPage clickByMakeOrder() {
        btnMakeOrder.click();
        return this;
    }

}
