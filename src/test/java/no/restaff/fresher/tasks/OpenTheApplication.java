package no.restaff.fresher.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import no.restaff.fresher.ui.HomePage;

public class OpenTheApplication implements Task {
    HomePage homePage;

    @Step("{0} open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(homePage)
        );
    }
}
