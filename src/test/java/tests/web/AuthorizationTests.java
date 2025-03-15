package tests.web;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.web.AuthorizationPage;

@Epic("Web")
@Feature("Authorization")
@Tag("Web")
public class AuthorizationTests extends TestBase{
    AuthorizationPage authPage = new AuthorizationPage();

    /**
     * Тест: Авторизация по логину и паролю
     * Шаги:
     * 1. Открыть страницу авторизации
     * 2. Проверить отображение текста заголовка на странице авторизации
     * 3. Кликнуть на вкладку "По почте или регистрационному номеру"
     * 4. Заполнить поле регистрационный номер
     * 5. Заполнить поле пароль
     * 6. Нажать кнопку войти
     * 7. Проверить отображение имени фамилии в верхней панели справа
     * Ожидаемый результат:
     * Успешная авторизация
     */
    @Test
    @DisplayName("Успешная авторизация по контракту и паролю")
    @Severity(SeverityLevel.BLOCKER)
    void authorizationTest() {
        authPage.openLoginPage()
                .checkSignInTitle("Вход")
                .loginByContractAndPassword()
                .setContract("2659567524")
                .setPassword("10069")
                .clickByEnter()
                .checkVisibleOfNameInProfile("Testfirstname Testlastname");
        System.out.println("Test");
    }

}
