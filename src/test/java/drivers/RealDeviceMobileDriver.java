package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.RealDevice;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static org.apache.commons.io.FileUtils.copyInputStreamToFile;

public class RealDeviceMobileDriver implements WebDriverProvider {

    static RealDevice configMD = ConfigFactory.create(RealDevice.class);

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        File app = getApp();

        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setPlatformName(configMD.platformName());
        options.setDeviceName(configMD.deviceName());
        options.setPlatformVersion(configMD.platformVersion());
        options.setApp(app.getAbsolutePath());
        options.setAppPackage("org.wikipedia.alpha");
        options.setAppActivity("org.wikipedia.main.MainActivity");

        return new AndroidDriver(getAppiumServerUrl(), options);
    }

    private File getApp() {
        String appUrl = "https://github.com/bkhezry/weather/releases/download/2.2.3/Weather-release-2.2.3.apk";
        String appPath = "src/test/resources/apps/Weather-release-2.2.3.apk";

        File app = new File(appPath);
        if (!app.exists()) {
            try (InputStream in = new URL(appUrl).openStream()) {
                copyInputStreamToFile(in, app);
            } catch (IOException e) {
                throw new AssertionError("Failed to download application", e);
            }
        }
        return app;
    }

    public static URL getAppiumServerUrl() {
        try {
            return new URL(configMD.baseURL());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}