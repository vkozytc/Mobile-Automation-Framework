package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "start_sign_in_button")
    public SelenideElement startSignInButton;

    @FindBy(id = "et_user_xid")
    public SelenideElement emailField;

    @FindBy(id = "et_user_passcode")
    public SelenideElement passwordField;

    @FindBy(id = "bt_sign_in")
    public SelenideElement signInButton;
}
