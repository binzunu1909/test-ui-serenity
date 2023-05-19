package no.restaff.fresher.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PopupDelete {

    public static Target DELETE_BUTTON =
            Target.the("delete button")
                    .locatedBy("//span[text()='Delete']/parent::button");
}
