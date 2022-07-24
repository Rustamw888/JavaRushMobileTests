package tests.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import static com.codeborne.selenide.Selenide.$;

public class Start {

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
}
