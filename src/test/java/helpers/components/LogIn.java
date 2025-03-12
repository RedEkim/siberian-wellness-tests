package helpers.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import org.junit.jupiter.api.Test;
import pages.web.LoginPage;
import tests.TestBase;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LogIn extends TestBase {
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

    @Step("authorization in app")
    @Test
    public void authInApp() {
        open("/login");
        waitForAppReady();
        closePopup();
        new LoginPage()
                .loginByContractAndPassword()
                .setContract("2659567524")
                .setPassword("10069")
                .clickByEnter();
        System.out.println("test");
    }
}
