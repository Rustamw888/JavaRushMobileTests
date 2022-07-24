package tests;

import enums.Professions;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static io.qameta.allure.Allure.step;

@Tag("android")
@DisplayName("Android test")
public class MappingTests extends TestBase {

    @Test
    @AllureId("11264")
    @DisplayName("Checking the training information")
    @Tags({@Tag("blocker"), @Tag("mobile")})
    void checkingTheTrainingInformation() {

        step("First page checking", () -> {
            start
                    .startedTextViewHeader
                    .shouldHave(text("Learn Java on the go"));
            start
                    .startedTextView
                    .shouldHave(text("Access the course anywhere"));
            start.secondPagePoint.click();
        });
        step("Second page checking", () -> {
            start
                    .startedTextViewHeader
                    .shouldHave(text("Program every day"));
            start
                    .startedTextView
                    .shouldHave(text("1200+ tasks on your smartphone"));
            start.thirdPagePoint.click();
        });
        step("Third page checking", () -> {
            start
                    .startedTextViewHeader
                    .shouldHave(text("Study substantive Java lessons"));
            start
                    .startedTextView
                    .shouldHave(text("Master new knowledge at your convenience"));
            start.forthPagePoint.click();
        });
        step("Fourth page checking", () -> {
            start
                    .startedTextViewHeader
                    .shouldHave(text("Grow closer to the Java community"));
            start
                    .startedTextView
                    .shouldHave(text("Help from students and developers"));
            start.firstPagePoint.click();
        });
        step("Get start", () -> {
            start
                    .startBtn
                    .shouldHave(text("Start")).click();
        });
    }

    @Test
    @AllureId("11268")
    @DisplayName("Checking the main page elements")
    @Tags({@Tag("blocker"), @Tag("mobile")})
    void mainPageElementsTest() {
        step("Checking elements visibility", () -> {
            main
                    .enterTextViewTitle
                    .shouldHave(text("Already have an account? "));
            main
                    .enterTextViewLink
                    .shouldHave(text("Sign in"));
            main.rootLayout.shouldBe(visible);
        });
    }

    @Test
    @AllureId("11267")
    @DisplayName("Checking for the display of cover page elements")
    @Tags({@Tag("blocker"), @Tag("mobile")})
    void theCoverPageOfAnApplicationTest() {
        step("Get start", () -> {
            start
                    .startBtn
                    .shouldHave(text("Start")).click();
        });
        step("Checking the cover page of an application", () -> {
            cover.imageView.shouldBe(visible);
            cover
                    .firstOrderTextView
                    .shouldHave(text("Welcome to JavaRush!"));
            cover
                    .secondOrderTextView
                    .shouldHave(text(
                            "Answer a few questions and we will prepare a " +
                                    "personalized learning program for you. Let's begin?"));
            cover
                    .startQuiz
                    .shouldHave(text("Start"));
        });
    }

    @Test
    @AllureId("11265")
    @DisplayName("Checking for the display of page elements with language selection")
    @Tags({@Tag("blocker"), @Tag("mobile")})
    void languageSelectionPageTest() {
        step("Go to relevant page", () -> {
            start.startBtn.click();
            cover.startQuiz.click();
        });
        step("Checking the cover page of an application", () -> {
            language
                    .languageTitle
                    .shouldHave(text("Choose your language"));
        });
        step("Checking the cover page of an application", () -> {
            int size = language.cardView.size();
            Assertions.assertEquals(size, 3);
        });
    }

    @Test
    @AllureId("11266")
    @DisplayName("Checking for display elements of the profession selection page")
    @Tags({@Tag("blocker"), @Tag("mobile")})
    void languageChooseTest() {
        step("Go to relevant page", () -> {
            start.startBtn.click();
            cover.startQuiz.click();
        });
        step("Selecting a language", () -> {
            languageChoose
                    .russianLanguage.click();
            languageChoose
                    .russianLanguage
                    .shouldNotBe(visible);
        });
        step("Page element checks", () -> {
            languageChoose
                    .careerTitle
                    .shouldHave(text("В будущем я хочу стать"));
            languageChoose
                    .decideLater
                    .shouldHave(text("Решу позже"));
            languageChoose
                    .javaDeveloper
                    .shouldHave(text(Professions.JAVA_DEVELOPER.getProfession()));
            languageChoose
                    .androidDeveloper
                    .shouldHave(text(Professions.ANDROID_DEVELOPER.getProfession()));
            languageChoose
                    .qaEngineer
                    .shouldHave(text(Professions.QA_ENGINEER.getProfession()));
        });
    }
}
