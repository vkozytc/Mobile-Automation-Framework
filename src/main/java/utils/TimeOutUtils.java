package utils;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

/**
 * @author Volodymyr Kozytskiy
 */
public final class TimeOutUtils {

    public final static int SELENIDE_TIME_OUT = 10 * 1000; //10 sec

    public final static int TIME_OUT = 25 * 1000; //25 sec

    public static void swipeByElements (SelenideElement startElement, SelenideElement endElement) {
        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);

        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);

        new TouchAction((PerformsTouchActions) getWebDriver())
                .press(point(startX,startY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endX, endY))
                .release().perform();
    }

}
