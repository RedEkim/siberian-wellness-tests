package helpers.components;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

public class LogIn {
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
}
