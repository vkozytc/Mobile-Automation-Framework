package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class AppTourPage {

    @FindBy(id = "inapptour_skip")
    public SelenideElement goToAppButton;

    @FindBy(id = "tour_content_title")
//    @FindBy(xpath = ".//*[contains(text(),'Advanced Workout Tracking')]")
    public SelenideElement tour_content_title;

    @FindBy(xpath = ".//*[contains(text(),'social')]")
    public SelenideElement appTourSocial;

}
