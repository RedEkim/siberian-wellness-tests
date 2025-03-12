package pages.web;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement
        authByPhone = $("[data-qa='BY_PHONE']"),
        authByMailOrRegNumber = $("[data-qa='BY_MAIL_OR_REG_NUMBER']"),
        btnSignIn = $("[data-qa='SIGN_IN_BTN']"),
        forgotPass = $("[class='sign-in__forgot-pass']"),
        fieldPassword = $("input[name='password']"),
        fieldContractOrEmail = $("input[name='contractOrEmail']"),
        userBarName = $("[data-qa='VUSERBAR_NAME']")    ;

    @Step("Login by contract and password")
    public LoginPage loginByContractAndPassword() {
        authByMailOrRegNumber.click();
        return this;
    }

    @Step("Set login")
    public LoginPage setContract(String contract) {
        fieldContractOrEmail.click();
        fieldContractOrEmail.sendKeys(contract);
//        fieldContractOrEmail.setValue("2659567524");
        return this;
    }

    @Step("Set password")
    public LoginPage setPassword(String password) {
        fieldPassword.setValue(password);
        return this;
    }

    @Step("Enter")
    public LoginPage clickByEnter() {
        btnSignIn.click();
        return this;
    }

    public LoginPage checkVisibleOfNameInProfile(String barName) {
        userBarName.shouldHave(text(barName));
        return this;
    }
}
