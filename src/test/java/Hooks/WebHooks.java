package Hooks;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class WebHooks {

    @BeforeEach
    public void allure()
    {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );
    }
    @Step("выходим из Jira")
    @org.junit.jupiter.api.AfterEach
    public void logout() {

        $x("//li[@id='user-options']").click();
        $x("//a[contains(text(),'Выйти')]").shouldBe(visible, Duration.ofSeconds(10)).click();



    }
}
