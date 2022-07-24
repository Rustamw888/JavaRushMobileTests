package tests.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import static com.codeborne.selenide.Selenide.$;

public class Main {

    public SelenideElement enterTextViewTitle = $(AppiumBy.id("com.hitechrush.jaxarush:id/enterTextViewTitle"));
    public SelenideElement enterTextViewLink = $(AppiumBy.id("com.hitechrush.jaxarush:id/enterTextViewLink"));
    public SelenideElement rootLayout = $(AppiumBy.id("com.hitechrush.jaxarush:id/rootLayout"));
}
