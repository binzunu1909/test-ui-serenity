package no.restaff.fresher.tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitWithTimeout;
import net.thucydides.core.annotations.Step;
import no.restaff.fresher.model.Activity;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static no.restaff.fresher.ui.ActivitiesPage.*;
import static no.restaff.fresher.ui.MenuUI.*;
import static no.restaff.fresher.ui.NewActivityPopUp.*;
import static no.restaff.fresher.ui.PopupDelete.DELETE_BUTTON;

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
                Click.on(REGISTER_DATA_MANAGER_ITEM),
                Click.on(ACTIVITIES_MANAGER_ITEM),
                Click.on(ACTIVITIES_ITEM),
                Pause.second(3),
                Click.on(ADD_NEW_ACTIVITY_BUTTON),
                Enter.theValue(activityName).into(ACTIVITY_NAME_FIELD),
                Enter.theValue(activityCode).into(ACTIVITY_CODE_FIELD),
                Click.on(ACTIVITY_TYPE_SELECTION),
                Click.on(START_OPTION),
                Click.on(ACTIVITY_CATEGORIES_MULTISELECTION),
                Click.on(BERTHING_OPTION),
                Click.on(CARGO_OPTION),
                Close.popup(),
                Click.on(SAVE_BUTTON),
                Pause.second(2),
                WaitUntil.the(SEARCH_ACTIVITY_NAME_FIELD, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(activityName).into(SEARCH_ACTIVITY_NAME_FIELD),
                WaitUntil.the(ACTIVITY_NAME_CREATED, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(DELETE_ACTIVITY_BUTTON),
                Click.on(DELETE_BUTTON),
                Pause.second(1)
        );
    }
}
