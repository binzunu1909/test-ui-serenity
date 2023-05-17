package no.restaff.fresher.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import no.restaff.fresher.model.Activity;
import no.restaff.fresher.model.User;

import static no.restaff.fresher.ui.ActivitiesPage.ADD_NEW_ACTIVITY_BUTTON;
import static no.restaff.fresher.ui.OSPage.*;

public class Create implements Task {
    private String activityName;

    public Create(Activity activity) {
        activityName = activity.getActivityName();
    }

    public static Performable newActivity(Activity activity) {
        return Tasks.instrumented(Create.class, activity);
    }

    @Override
    @Step("{0} creates new activity whose name is #activityName")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU_BUTTON),
                Click.on(REGISTER_DATA_MANAGER),
                Click.on(ACTIVITIES_MANAGER),
                Click.on(ACTIVITIES),
                Click.on(ADD_NEW_ACTIVITY_BUTTON)
        );
    }
}