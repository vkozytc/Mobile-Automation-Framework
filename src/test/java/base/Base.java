package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.FileUtils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static utils.TimeOutUtils.SELENIDE_TIME_OUT;

public class Base {

    private static AppiumDriver driver;
    private static final String GENARAL_PROPERTIES = "properties.properties";

    @BeforeAll
    public static void setUpAppium() throws MalformedURLException {
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide().screenshots(true).savePageSource(false));
        Configuration.timeout = SELENIDE_TIME_OUT;
        Configuration.baseUrl = "http://127.0.0.1:4723/wd/hub";
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "src/test/resources");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage", "com.netpulse.mobile.revgen.debug");
        capabilities.setCapability("appWaitActivity", "*");
        File app = new File(appDir, FileUtils.readPropertiesFile(GENARAL_PROPERTIES).getProperty("app"));
        capabilities.setCapability("deviceName", FileUtils.readPropertiesFile(GENARAL_PROPERTIES).getProperty("deviceName"));
        capabilities.setCapability("platformVersion", FileUtils.readPropertiesFile(GENARAL_PROPERTIES).getProperty("platformVersion"));
        capabilities.setCapability("platformName", FileUtils.readPropertiesFile(GENARAL_PROPERTIES).getProperty("platformName"));
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver<>(new URL(Configuration.baseUrl), capabilities);
        WebDriverRunner.setWebDriver(driver);

    }

    @AfterEach
    public void clearCookie() {
        driver.resetApp();
    }

}
