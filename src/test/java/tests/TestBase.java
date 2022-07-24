package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import drivers.BrowserstackMobileDriver;
import drivers.EmulatorMobileDriver;
import drivers.AndroidRealDeviceMobileDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import tests.pages.Cover;
import tests.pages.Language;
import tests.pages.LanguageChoose;
import tests.pages.Main;
import tests.pages.Start;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.Attach.sessionId;
import static io.qameta.allure.Allure.step;;

public class TestBase {

    static String host = System.getProperty("host", "androidEmulator");
    Cover cover = new Cover();
    Language language = new Language();
    LanguageChoose languageChoose = new LanguageChoose();
    Main main = new Main();
    Start start = new Start();

    @BeforeAll
    public static void setup() {
        switch (host) {
            case ("realDevice"):
                Configuration.browser = AndroidRealDeviceMobileDriver.class.getName();
                break;
            case ("androidEmulator"):
                Configuration.browser = EmulatorMobileDriver.class.getName();
                break;
            case ("browserStack"):
                Configuration.browser = BrowserstackMobileDriver.class.getName();
                break;
        }
        Configuration.browserSize = null;
    }

    @BeforeEach
    public void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    public void afterEach() {
        String sessionId = sessionId();
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        step("Close driver", Selenide::closeWebDriver);
        if (host.equals("browserStack")) {
            Attach.video(sessionId);
        }
    }
}
