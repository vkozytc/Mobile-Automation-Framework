package steps;

import com.codeborne.selenide.Condition;
import pages.AppTourPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.page;

public class LoginPageSteps {

    public LoginPage loginPage = page(LoginPage.class);
    public AppTourPage appTourPage = page(AppTourPage.class);

    public void signIn(String email, String password){
        loginPage.startSignInButton.click();
        loginPage.emailField.shouldBe(Condition.visible);
        loginPage.emailField.sendKeys(email);
        loginPage.passwordField.sendKeys(password);
        loginPage.signInButton.click();
        appTourPage.tour_content_title.shouldBe(Condition.visible);
        appTourPage.tour_content_title.shouldHave(Condition.text("Advanced Workout Tracking"));
    }

}
