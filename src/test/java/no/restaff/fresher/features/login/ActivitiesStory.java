package no.restaff.fresher.features.login;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import no.restaff.fresher.model.Activity;
import no.restaff.fresher.model.User;
import no.restaff.fresher.tasks.Create;
import no.restaff.fresher.tasks.Login;
import no.restaff.fresher.tasks.OpenTheApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ActivitiesStory {

    Actor anna = Actor.named("Anna");

    User user = new User("testbot@mailinator.com","Password..1");
    Activity activity = new Activity("READY FOR TEST", "RFT","");

    @Managed(uniqueSession = true)
    public WebDriver yourBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void userCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(yourBrowser));
    }

    @Test
    public void userLogin() {
        anna.wasAbleTo(openTheApplication);
        anna.attemptsTo(
                Login.asMember(user)
        );
    }

    @Test
    public void userCreateActivity() {
        anna.attemptsTo(
              Create.newActivity(activity)
        );
    }
}