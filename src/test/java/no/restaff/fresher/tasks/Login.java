package no.restaff.fresher.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import no.restaff.fresher.model.User;

import static no.restaff.fresher.ui.LoginPage.*;
import static no.restaff.fresher.ui.LoginPage.SIGN_IN_BUTTON;

public class Login implements Task {
    private String username;
    private String password;
    public Login(User user) {
        username = user.getUsername();
        password = user.getPassword();
    }

    public static Performable asMember(User user) {
        return Tasks.instrumented(Login.class, user);
    }

    @Override
    @Step("{0} logs in as #username")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NON_SSO_BUTTON),
                Enter.theValue(username).into(USERNAME_FIELD),
                Enter.theValue(password).into(PASSWORD_FIELD),
                Click.on(SIGN_IN_BUTTON)
        );
    }
}
