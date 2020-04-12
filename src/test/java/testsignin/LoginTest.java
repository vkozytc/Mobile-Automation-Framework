package testsignin;

import base.Base;
import org.junit.jupiter.api.Test;
import steps.AppTourSteps;
import steps.ChangeBeSteps;
import steps.LoginPageSteps;


public class LoginTest extends Base {

    public ChangeBeSteps changeBeSteps = new ChangeBeSteps();
    public LoginPageSteps loginPageSteps = new LoginPageSteps();
    public AppTourSteps appTourSteps = new AppTourSteps();


    @Test
    public void loginTest() {
        changeBeSteps.changeBackendAdress("https://.com");
        loginPageSteps.signIn("2", "d");
    }

}