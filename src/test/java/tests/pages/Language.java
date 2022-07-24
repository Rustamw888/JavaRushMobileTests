package tests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Language {

    public SelenideElement languageTitle = $(AppiumBy.id("com.hitechrush.jaxarush:id/languageTitle"));
    public ElementsCollection cardView = $$(AppiumBy.className("androidx.cardview.widget.CardView"));
}
