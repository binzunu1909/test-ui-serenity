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
    private String activityCode;

    public Create(Activity activity) {
        activityName = activity.getActivityName();
        activityCode = activity.getActivityCode();
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
                Click.on(ADD_NEW_ACTIVITY_BUTTON),
                Enter.theValue(activityName).inTo(ACTIVITY_NAME_FIELD),
                Enter.theValue(activityCode).inTo(ACTIVITY_CODE_FIELD),
                Click.on(ACTIVITY_TYPE_SELECTION),
                Click.on(START_OPTION),
                Click.on(ACTIVITY_CATEGORIES_MULTISELECTION),
                Click.on(BERTHING_OPTION),
                Click.on(CARGO_OPTION),
                Click.on(SAVE_BUTTON)
        );
    }
}
