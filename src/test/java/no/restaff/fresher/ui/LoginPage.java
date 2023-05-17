package no.restaff.fresher.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static Target USERNAME_FIELD = Target.the("username field").located(By.name("username"));
    public static Target NON_SSO_BUTTON = Target.the("Non-SSO button").locatedBy("//span[text()='Non-SSO']");
    public static Target PASSWORD_FIELD = Target.the("password field").located(By.name("password"));
    public static Target SIGN_IN_BUTTON = Target.the("sign in button").locatedBy("//span[text()='Sign In']");
}
