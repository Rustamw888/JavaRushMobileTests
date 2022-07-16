package tests.selectors;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import enums.Languages;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Selectors {

    // start pages
    public SelenideElement startedTextViewHeader = $(AppiumBy.id("com.hitechrush.jaxarush:id/startedTextViewHeader"));
    public SelenideElement startedTextView = $(AppiumBy.id("com.hitechrush.jaxarush:id/startedTextView"));
    public SelenideElement firstPagePoint = $(AppiumBy.xpath(
            "//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]"));
    public SelenideElement secondPagePoint = $(AppiumBy.xpath(
            "//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]"));
    public SelenideElement thirdPagePoint = $(AppiumBy.xpath(
            "//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]"));
    public SelenideElement forthPagePoint = $(AppiumBy.xpath(
            "//android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]"));
    public SelenideElement startBtn = $(AppiumBy.id("com.hitechrush.jaxarush:id/start"));

    // main page
    public SelenideElement enterTextViewTitle = $(AppiumBy.id("com.hitechrush.jaxarush:id/enterTextViewTitle"));
    public SelenideElement enterTextViewLink = $(AppiumBy.id("com.hitechrush.jaxarush:id/enterTextViewLink"));
    public SelenideElement rootLayout = $(AppiumBy.id("com.hitechrush.jaxarush:id/rootLayout"));

    // cover page
    public SelenideElement startQuiz = $(AppiumBy.id("com.hitechrush.jaxarush:id/startQuiz1"));
    public SelenideElement firstOrderTextView = $(AppiumBy.xpath(
            "//android.widget.LinearLayout/android.widget.TextView[1]"));
    public SelenideElement secondOrderTextView = $(AppiumBy.xpath(
            "//android.widget.LinearLayout/android.widget.TextView[2]"));
    public SelenideElement imageView = $(AppiumBy.className("android.widget.ImageView"));

    // language page
    public SelenideElement languageTitle = $(AppiumBy.id("com.hitechrush.jaxarush:id/languageTitle"));
    public ElementsCollection cardView = $$(AppiumBy.className("androidx.cardview.widget.CardView"));

    //language choose
    public SelenideElement russianLanguage = $(AppiumBy.xpath(
            "//android.widget.TextView[@text=\"" + Languages.RUSSIAN.getLanguageName() + "\"]"));
    public SelenideElement ukrainianLanguage = $(AppiumBy.xpath(
            "//android.widget.TextView[@text=\"" + Languages.UKRAINIAN.getLanguageName() + "\"]"));
    public SelenideElement englishLanguage = $(AppiumBy.xpath(
            "//android.widget.TextView[@text=\"" + Languages.ENGLISH.getLanguageName() + "\"]"));
    public SelenideElement careerTitle = $(AppiumBy.id("com.hitechrush.jaxarush:id/careerTitle"));
    public SelenideElement decideLater = $(AppiumBy.id("com.hitechrush.jaxarush:id/decideLater"));
    public SelenideElement javaDeveloper = $(AppiumBy.id("com.hitechrush.jaxarush:id/javaDeveloper"));
    public SelenideElement androidDeveloper = $(AppiumBy.id("com.hitechrush.jaxarush:id/androidDeveloper"));
    public SelenideElement qaEngineer = $(AppiumBy.id("com.hitechrush.jaxarush:id/qaEngineer"));
}
