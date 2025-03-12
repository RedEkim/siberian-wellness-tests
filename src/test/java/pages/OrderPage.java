package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import helpers.components.LogIn;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.textsInAnyOrder;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static constants.KzPaymentServices.CARD;
import static constants.KzPaymentServices.SELFPAY;

public class OrderPage {
    private final SelenideElement
        selfDelivery = $("[data-qa='pickup']"),
        courierDelivery = $("[data-qa='courier']"),
        btnChoose= $("[data-qa='SW_BUTTON']"),
        btnSubmit = $("[data-qa='DELIVERY-RECIPIENT-DATA-SUBMIT']"),
        buyByCard = $("[data-qa='ORDER_CARD_TITLE_EPAY2']"),
        btnSummarySubmit = $("[data-qa='summarySubmit']"),
        emailForCheck = $("input[type='email']");

    private final String paymentTypeList = ".order-delivery-radio-select";

    /** loaded component LogIn
     *  this component was build in package component
     *  because it often uses
     */

    LogIn login = new LogIn();

    @Step("Click by logIn")
    public OrderPage clickByLogIn() {
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
    public OrderPage payBy(String paymentType) {
        var type = $$(paymentTypeList).filter(text(paymentType)).first();
        type.click();
        type.$("[type='radio'][data-checked='true']").shouldBe(Condition.checked);
        return this;
    }

    @Step("Проверяем, что для Казахстана всегда отображается два способа оплаты")
    public OrderPage checkListKzPaymentType() {
        $$(paymentTypeList).shouldHave(size(2)
                .because("Список с доступными способами оплаты должен быть из двух элементов"));
        $$(".order-delivery-radio-select__title")
                .shouldHave(textsInAnyOrder(List.of(CARD, SELFPAY)));
        return this;
    }

    @Step("Click by button SummarySubmit")
    public OrderPage clickBtnSummarySubmit() {
        btnSummarySubmit.shouldBe(visible);
        btnSummarySubmit.click();
        return this;
    }

    @Step("Set email for check")
    public  OrderPage setEmailForCheck() {
        emailForCheck.setValue("testforSW@testmail.com");
        return this;
    }
}
