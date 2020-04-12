package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ChangeBePage {

    @FindBy(id = "dynamic_be_et")
    public SelenideElement beAdress;

    @FindBy(id = "submit")
    public SelenideElement submitBe;
}
