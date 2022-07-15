package tests;

import com.codeborne.selenide.CollectionCondition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.back;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("android")
public class MappingTests extends TestBase {

    @Test
    void checkingTheTrainingInformation() {

        step("First page checking", () -> {
            $(AppiumBy.id("com.hitechrush.jaxarush:id/startedTextViewHeader"))
                    .shouldHave(text("Learn Java on the go"));
            $(AppiumBy.id("com.hitechrush.jaxarush:id/startedTextView"))
                    .shouldHave(text("Access the course anywhere"));
            $(AppiumBy.xpath("//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]")).click();
        });

        step("Second page checking", () -> {
            $(AppiumBy.id("com.hitechrush.jaxarush:id/startedTextViewHeader"))
                    .shouldHave(text("Program every day"));
            $(AppiumBy.id("com.hitechrush.jaxarush:id/startedTextView"))
                    .shouldHave(text("1200+ tasks on your smartphone"));
            $(AppiumBy.xpath("//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]")).click();
        });

        step("Third page checking", () -> {
            $(AppiumBy.id("com.hitechrush.jaxarush:id/startedTextViewHeader"))
                    .shouldHave(text("Study substantive Java lessons"));
            $(AppiumBy.id("com.hitechrush.jaxarush:id/startedTextView"))
                    .shouldHave(text("Master new knowledge at your convenience"));
            $(AppiumBy.xpath("//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]")).click();
        });

        step("Fourth page checking", () -> {
            $(AppiumBy.id("com.hitechrush.jaxarush:id/startedTextViewHeader"))
                    .shouldHave(text("Grow closer to the Java community"));
            $(AppiumBy.id("com.hitechrush.jaxarush:id/startedTextView"))
                    .shouldHave(text("Help from students and developers"));
        });

        step("Get start", () -> {
            $(AppiumBy.id("com.hitechrush.jaxarush:id/start"))
                    .shouldHave(text("Start")).click();
        });
    }

    @Test
    void mainPageElementsTest() {
        step("Checking elements visibility", () -> {
            $(AppiumBy.id("com.hitechrush.jaxarush:id/enterTextViewTitle"))
                    .shouldHave(text("Already have an account? "));
            $(AppiumBy.id("com.hitechrush.jaxarush:id/enterTextViewLink"))
                    .shouldHave(text("Sign in"));
            $(AppiumBy.id("com.hitechrush.jaxarush:id/rootLayout")).shouldBe(visible);
        });
    }

//    @Test
//    void displayItemsWhenSearchIsActiveTest() {
//        step("Checking element visibility", () -> {
//            $(AppiumBy.id("com.github.bkhezry.weather:id/toolbar")).click();
//            $(AppiumBy.id("com.github.bkhezry.weather:id/action_up_btn")).shouldBe(visible);
//            $(AppiumBy.id("com.github.bkhezry.weather:id/search_text_view"))
//                    .shouldHave(text("Search"));
//        });
//    }
//
//    @Test
//    void inputFieldCleaningFunctionalityTest() {
//        step("Input field cleaning functionality", () -> {
//            $(AppiumBy.id("com.github.bkhezry.weather:id/toolbar")).click();
//            $(AppiumBy.className("android.widget.EditText")).sendKeys("Kazan");
//            $(AppiumBy.id("com.github.bkhezry.weather:id/action_up_btn")).click();
//            $(AppiumBy.id("com.github.bkhezry.weather:id/search_text_view"))
//                    .shouldHave(text("Search for a city"));
//            $(AppiumBy.id("com.github.bkhezry.weather:id/action_up_btn")).shouldNotBe(visible);
//        });
//    }
//
//    @Test
//    void functionalityTest() {
//        step("Verify content found", () -> {
//            $(AppiumBy.id("com.github.bkhezry.weather:id/toolbar")).click();
//            $(AppiumBy.className("android.widget.EditText")).sendKeys("Kazan");
//            $(AppiumBy.className("android.widget.EditText")).pressEnter();
//
//        });
//    }
//
//
//
//
//
//
//
//    @Test
//    void firstSearchPositiveTest() {
//
//        step("First page checking", () -> {
//            $(AppiumBy.id("org.wikipedia.alpha:id/secondaryTextView"))
//                    .shouldHave(text("We’ve found the following on your device:"));
//            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
//        });
//
//        step("Second page checking", () -> {
//            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
//                    .shouldHave(text("New ways to explore"));
//            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
//        });
//
//        step("Third page checking", () -> {
//            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
//                    .shouldHave(text("Reading lists with sync"));
//            $(AppiumBy.id("org.wikipedia.alpha:id/imageViewCentered")).shouldBe(visible);
//            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click();
//        });
//
//        step("Fourth page checking", () -> {
//            $(AppiumBy.id("org.wikipedia.alpha:id/switchView")).shouldBe(visible);
//            $(AppiumBy.id("org.wikipedia.alpha:id/fragment_onboarding_done_button")).shouldHave(text("GET STARTED")).click();
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).shouldBe(visible);
//        });
//    }
//
//    @Test
//    void firstSearchPositiveTest1() {
//        back();
//        step("Type search", () -> {
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Star wars");
//        });
//
//        step("Verify content found", () ->
//                $$(AppiumBy.className("android.widget.TextView"))
//                        .shouldHave(CollectionCondition.sizeGreaterThan(0)));
//
//        step("Verify content found", () ->
//                $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_image")).shouldBe(visible));
//
//        step("Verify image is visible", () -> {
//            $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
//                    .find(matchText("Star Wars")).click();
//
//            $(AppiumBy.id("org.wikipedia.alpha:id/view_page_header_image")).shouldBe(visible);
//        });
//    }
//
//    @Test
//    void secondSearchPositiveTest() {
//        back();
//        step("Type search", () -> {
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Star Wars");
//        });
//
//        step("Assert textView", () -> {
//            String actualText = $(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).text();
//            assertEquals(actualText, "Star Wars");
//        });
//    }
//
//    @Test
//    void searchNegativeTest() {
//        back();
//        step("Type search", () -> {
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
//            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("__________________");
//        });
//
//        step("Verify no results displayed", () ->
//                $(AppiumBy.id("org.wikipedia.alpha:id/results_text"))
//                        .shouldHave(text("No results"))
//        );
//    }
}
