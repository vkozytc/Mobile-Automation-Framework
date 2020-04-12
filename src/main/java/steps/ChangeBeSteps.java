package steps;

import com.codeborne.selenide.Condition;
import pages.ChangeBePage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.page;

public class ChangeBeSteps {

    private ChangeBePage changeBePage = page(ChangeBePage.class);
    private LoginPage loginPage = page(LoginPage.class);

    public void changeBackendAdress(String backendAdress) {
        changeBePage.beAdress.clear();
        changeBePage.beAdress.sendKeys(backendAdress);
        changeBePage.submitBe.click();
        loginPage.startSignInButton.shouldBe(Condition.visible);
    }

}
