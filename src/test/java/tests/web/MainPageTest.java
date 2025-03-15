package tests.web;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Epic("Web")
@Feature("Main page")
@Tag("Web")
public class MainPageTest extends TestBase{
    /** Тест: Доступность главной страницы
     * Шаги:
     * 1. Открыть главную страницу
     * 2. Пролистать на нужного элемента
     * 3. Проверить отображение(visible) нужного элемента главной страницы
     * Ожидаемое поведение:
     * Элемент главной страницы отображается
     */

    @Test
    @DisplayName("Успешное открытие главной страницы")
    @Story("Testing main page")
    void checkOpeningMainPage() {
        open("");
        $(".slider-with-chips__slides").scrollIntoView(false);
        $(".slider-with-chips__slides").shouldBe(visible);
    }

}
