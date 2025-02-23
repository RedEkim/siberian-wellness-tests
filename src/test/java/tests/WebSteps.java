package tests;


import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.codeborne.selenide.WebDriverRunner;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step("Открываем поисковик")
    public void openMainPage() {
        open("https://www.google.com");
    }

    @Step("Делаем тестовый поиск по фразе: {testPhrase}")
    public void testSearchForPhrase(String testPhrase) {
        $("[name='q']").click();
        $("[name='q']").sendKeys(testPhrase);
        $("[name='q']").submit();
    }

    @Attachment(value = "Screenshot", type = "image/png", fileExtension = "png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot)WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
