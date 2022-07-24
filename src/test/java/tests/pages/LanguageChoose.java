package tests.pages;

import com.codeborne.selenide.SelenideElement;
import enums.Languages;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class LanguageChoose {

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
