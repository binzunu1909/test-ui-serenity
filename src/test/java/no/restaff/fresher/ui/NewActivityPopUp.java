package no.restaff.fresher.ui;

import net.serenitybdd.screenplay.targets.Target;

public class NewActivityPopUp {

    public static Target FIELD =
            Target.the("{0} field")
                    .locatedBy("//label[text()='{0}']/following-sibling::div//input");
    public static Target SELECTION =
            Target.the("{0} selection")
                    .locatedBy("//label[text()='{0}']/following-sibling::div");
    public static Target OPTIONS_MULTISELECTION =
            Target.the("{0} selection")
                    .locatedBy("//span[text()='{0}']");

    public static Target SELECTION_ITEM_FOR_TEXT =
            Target.the("{0} item")
                    .locatedBy("//li[text()='{0}']");

    public static Target SELECTION_ITEM_FOR_POSITION_XPATH =
            Target.the("The item have position {0} in the Activity Types selection")
                    .locatedBy("//ul[@aria-labelledby='type-select-label']/li[{0}]");

    public static Target SELECTION_ITEM_FOR_POSITION_XPATH_LENGTH = Target.the("length item")
            .locatedBy("count(//ul[@aria-labelledby='type-select-label']/li)");




    public static Target ACTIVITY_NAME_FIELD = FIELD.of("Activity Name");
    public static Target ACTIVITY_CODE_FIELD = FIELD.of("Activity Code");
    public static Target ACTIVITY_TYPE_SELECTION = SELECTION.of("Activity Type");
    public static Target ACTIVITY_CATEGORIES_MULTISELECTION = SELECTION.of("Activity Categories");
    public static Target START_OPTION =
            Target.the("start option")
                    .locatedBy("//li[text()='START']");

    public static Target BERTHING_OPTION = OPTIONS_MULTISELECTION.of("BERTHING");
    public static Target CARGO_OPTION = OPTIONS_MULTISELECTION.of("CARGO");

    public static Target SAVE_BUTTON =
            Target.the("save button")
                    .locatedBy("//span[text()='Save']/parent::button");
    public static Target OUT_SIDE_POPUP =
            Target.the("outside popup")
                    .locatedBy("//body");
}
