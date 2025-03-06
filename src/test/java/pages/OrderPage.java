package pages;

import com.codeborne.selenide.SelenideElement;
import helpers.components.LogIn;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OrderPage {
    private final SelenideElement
        selfDelivery = $("[data-qa='pickup']"),
        courierDelivery = $("[data-qa='courier']"),
        btnChoose= $("[data-qa='SW_BUTTON']"),
        btnSubmit = $("[data-qa='DELIVERY-RECIPIENT-DATA-SUBMIT']"),
        buyByCard = $("[data-qa='ORDER_CARD_TITLE_EPAY2']");

    /** loaded component LogIn
     *  this component was build in package component
     *  because it often uses
     */

    LogIn login = new LogIn();

    @Step("Click by logIn")
    public  OrderPage clickByLogIn() {
        login.getBtnLogIn().click();
        return this;
    }

    @Step("Login by contract and password")
    public OrderPage loginByContractAndPassword() {
        login.getAuthByMailOrRegNumber().click();
        return this;
    }

    @Step("Set login")
    public OrderPage setContract(String contract) {
        login.getFieldContractOrEmail().click();
        login.getFieldContractOrEmail().sendKeys(contract);
        return this;
    }

    @Step("Set password")
    public OrderPage setPassword(String password) {
        login.getFieldPassword().setValue(password);
        return this;
    }

    @Step("Enter")
    public OrderPage clickByEnter() {
        login.getBtnSignIn().click();
        return this;
    }

    @Step("chose self delivery")
    public OrderPage clickBySelfDelivery() {
        selfDelivery.click();
        return this;
    }

    @Step("Choose first self delivery point")
    public OrderPage chooseFirstSelf() {
        btnChoose.click();
        return this;
    }

    @Step("Click by submit order")
    public OrderPage clickSubmit() {
        btnSubmit.click();
        return this;
    }

    @Step("Choose method of pay")
    public OrderPage payByCard() {
        $(By.type("radio")).selectRadio("[data-qa='ORDER_CARD_TITLE_EPAY2']");
        return this;
    }
}
