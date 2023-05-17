package no.restaff.fresher.features.login;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import no.restaff.fresher.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import no.restaff.fresher.tasks.OpenTheApplication;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static no.restaff.fresher.ui.LoginPage.*;

@RunWith(SerenityRunner.class)
public class LoginStory {

    Actor anna = Actor.named("Anna");

    User user = new User("testbot@mailinator.com","Password..1");
    String USERNAME = user.getUsername();
    String PASSWORD = user.getPassword();

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void search_results_should_show_the_search_term_in_the_title() {

        givenThat(anna).wasAbleTo(openTheApplication);

        when(anna).attemptsTo(
                Click.on(NON_SSO_BUTTON),
                Enter.theValue(USERNAME).into(USERNAME_FIELD),
                Enter.theValue(PASSWORD).into(PASSWORD_FIELD),
                Click.on(SIGN_IN_BUTTON)
        );
    }
}