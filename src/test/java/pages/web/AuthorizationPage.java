package pages.web;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {
    @Getter
    private final SelenideElement
            btnLogIn = $("[data-qa='ORDER_CARD_TITLE_LOGIN']"),
            authByPhone = $("[data-qa='BY_PHONE']"),
            authByMailOrRegNumber = $("[data-qa='BY_MAIL_OR_REG_NUMBER']"),
            btnSignIn = $("[data-qa='SIGN_IN_BTN']"),
            forgotPass = $("[class='sign-in__forgot-pass']"),
            fieldPassword = $("input[name='password']"),
            fieldContractOrEmail = $("input[name='contractOrEmail']"),
            userBarName = $("[data-qa='VUSERBAR_NAME']");

    @Step("Login by contract and password")
    public AuthorizationPage loginByContractAndPassword() {
        authByMailOrRegNumber.click();
        return this;
    }

    @Step("Set login")
    public AuthorizationPage setContract(String contract) {
        fieldContractOrEmail.click();
        fieldContractOrEmail.sendKeys(contract);
        return this;
    }

    @Step("Set password")
    public AuthorizationPage setPassword(String password) {
        fieldPassword.sendKeys(password);
        return this;
    }

    @Step("Enter")
    public AuthorizationPage clickByEnter() {
        btnSignIn.click();
        return this;
    }

    public AuthorizationPage checkVisibleOfNameInProfile(String barName) {
        userBarName.shouldHave(text(barName));
        return this;
    }
}
