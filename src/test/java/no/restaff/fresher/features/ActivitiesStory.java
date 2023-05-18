package no.restaff.fresher.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import no.restaff.fresher.model.Activity;
import no.restaff.fresher.model.User;
import no.restaff.fresher.tasks.*;
import org.junit.Before;
import org.junit.Test;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static no.restaff.fresher.ui.ActivitiesPage.ACTIVITY_NAME_CREATED;

import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
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
                Login.asMember(user),
                Pause.second(30),
                Create.newActivity(activity)
        );
    }

}