package no.restaff.fresher.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import no.restaff.fresher.model.Activity;
import no.restaff.fresher.model.ActivityTypes;
import no.restaff.fresher.model.User;
import no.restaff.fresher.tasks.*;
import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ActivitiesStory {

    Actor anna = Actor.named("Anna");
    User user = new User("testbot@mailinator.com","Password..1");
    Activity activity = new Activity();

    @Managed(uniqueSession = true)
    public WebDriver yourBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void userCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(yourBrowser));
    }

    @Test
    public void user_login_and_create_new_activity_then_delete() {
        anna.wasAbleTo(openTheApplication);
        anna.attemptsTo(
                Login.asMember(user),
                Create.newActivity(activity)
        );
    }

}