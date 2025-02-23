package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class StepsTestClass {

    private static final String TEST_SEARCH = "Кто убил Марка";
    @Test
    public void testLambdaStep() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Открываем поисковик", () -> {
            open("https://www.google.com");
        });

        step("Делаем тестовый поиск по фразе: " + TEST_SEARCH, () -> {
            $("[name='q']").click();
            $("[name='q']").sendKeys(TEST_SEARCH);
            $("[name='q']").submit();
        });
    }

    @Test
    public  void testAnnotatedStep() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps webSteps = new WebSteps();
        webSteps.openMainPage();
        webSteps.testSearchForPhrase(TEST_SEARCH);
    }
}
