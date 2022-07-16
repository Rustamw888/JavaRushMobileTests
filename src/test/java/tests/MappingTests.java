package tests;

import enums.Professions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.selectors.Selectors;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static io.qameta.allure.Allure.step;

@Tag("android")
public class MappingTests extends TestBase {

    Selectors selectors = new Selectors();

    @Test
    @DisplayName("Checking the training information")
    void checkingTheTrainingInformation() {

        step("First page checking", () -> {
            selectors
                    .startedTextViewHeader
                    .shouldHave(text("Learn Java on the go"));
            selectors
                    .startedTextView
                    .shouldHave(text("Access the course anywhere"));
            selectors.secondPagePoint.click();
        });
        step("Second page checking", () -> {
            selectors
                    .startedTextViewHeader
                    .shouldHave(text("Program every day"));
            selectors
                    .startedTextView
                    .shouldHave(text("1200+ tasks on your smartphone"));
            selectors.thirdPagePoint.click();
        });
        step("Third page checking", () -> {
            selectors
                    .startedTextViewHeader
                    .shouldHave(text("Study substantive Java lessons"));
            selectors
                    .startedTextView
                    .shouldHave(text("Master new knowledge at your convenience"));
            selectors.forthPagePoint.click();
        });
        step("Fourth page checking", () -> {
            selectors
                    .startedTextViewHeader
                    .shouldHave(text("Grow closer to the Java community"));
            selectors
                    .startedTextView
                    .shouldHave(text("Help from students and developers"));
            selectors.firstPagePoint.click();
        });
        step("Get start", () -> {
            selectors
                    .startBtn
                    .shouldHave(text("Start")).click();
        });
    }

    @Test
    @DisplayName("Checking the main page elements")
    void mainPageElementsTest() {
        step("Checking elements visibility", () -> {
            selectors
                    .enterTextViewTitle
                    .shouldHave(text("Already have an account? "));
            selectors
                    .enterTextViewLink
                    .shouldHave(text("Sign in"));
            selectors.rootLayout.shouldBe(visible);
        });
    }

    @Test
    @DisplayName("Checking for the display of cover page elements")
    void theCoverPageOfAnApplicationTest() {
        step("Get start", () -> {
            selectors
                    .startBtn
                    .shouldHave(text("Start")).click();
        });
        step("Checking the cover page of an application", () -> {
            selectors.imageView.shouldBe(visible);
            selectors
                    .firstOrderTextView
                    .shouldHave(text("Welcome to JavaRush!"));
            selectors
                    .secondOrderTextView
                    .shouldHave(text(
                            "Answer a few questions and we will prepare a " +
                            "personalized learning program for you. Let's begin?"));
            selectors
                    .startQuiz
                    .shouldHave(text("Start"));
        });
    }

    @Test
    @DisplayName("Checking for the display of page elements with language selection")
    void languageSelectionPageTest() {
        step("Go to relevant page", () -> {
            selectors.startBtn.click();
            selectors.startQuiz.click();
        });
        step("Checking the cover page of an application", () -> {
            selectors
                    .languageTitle
                    .shouldHave(text("Choose your language"));
        });
        step("Checking the cover page of an application", () -> {
            int size = selectors.cardView.size();
            Assertions.assertEquals(size, 3);
        });
    }

    @Test
    @DisplayName("Checking for display elements of the profession selection page")
    void languageChooseTest() {
        step("Go to relevant page", () -> {
            selectors.startBtn.click();
            selectors.startQuiz.click();
        });
        step("Selecting a language", () -> {
            selectors
                    .russianLanguage.click();
            selectors
                    .russianLanguage
                    .shouldNotBe(visible);
        });
        step("Page element checks", () -> {
            selectors
                    .careerTitle
                    .shouldHave(text("В будущем я хочу стать"));
            selectors
                    .decideLater
                    .shouldHave(text("Решу позже"));
            selectors
                    .javaDeveloper
                    .shouldHave(text(Professions.JAVA_DEVELOPER.getProfession()));
            selectors
                    .androidDeveloper
                    .shouldHave(text(Professions.ANDROID_DEVELOPER.getProfession()));
            selectors
                    .qaEngineer
                    .shouldHave(text(Professions.QA_ENGINEER.getProfession()));
        });
    }
}
