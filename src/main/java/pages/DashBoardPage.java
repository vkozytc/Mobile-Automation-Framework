package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage {

    @FindBy(id = "permission_allow_button")
    public SelenideElement permissionAllowButton;

    @FindBy(xpath = ".//*[contains(text(),'FIND A CLASS')]")
    public SelenideElement findAClassButton;

}
