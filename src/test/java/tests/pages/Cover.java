package tests.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import static com.codeborne.selenide.Selenide.$;

public class Cover {

    public SelenideElement startQuiz = $(AppiumBy.id("com.hitechrush.jaxarush:id/startQuiz1"));
    public SelenideElement firstOrderTextView = $(AppiumBy.xpath(
            "//android.widget.LinearLayout/android.widget.TextView[1]"));
    public SelenideElement secondOrderTextView = $(AppiumBy.xpath(
            "//android.widget.LinearLayout/android.widget.TextView[2]"));
    public SelenideElement imageView = $(AppiumBy.className("android.widget.ImageView"));
}
