package no.restaff.fresher.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ActivitiesPage {
    public static Target ADD_NEW_ACTIVITY_BUTTON =
            Target.the("add new activity button")
                    .locatedBy("//span[@class='jss4177']");
    public static Target ACTIVITY_NAME_FIELD =
            Target.the("activity name field")
                    .locatedBy("//label[text()='Activity Name']");
    public static Target ACTIVITY_CODE_FIELD =
            Target.the("activity code field")
                    .locatedBy("//label[text()='Activity Code']");
    public static Target ACTIVITY_TYPE_SELECTION =
            Target.the("activity type selection")
                    .locatedBy("//label[text()='Activity Type']");
    public static Target ACTIVITY_CATEGORIES_MULTISELECTION =
            Target.the("activity categories multiselection")
                    .locatedBy("//label[text()='Activity Categories']");
    public static Target START_OPTION =
            Target.the("start option")
                    .locatedBy("//li[text()='START']");
    public static Target BERTHING_OPTION =
            Target.the("berthing option")
                    .locatedBy("//span[text()='BERTHING']");        
    public static Target CARGO_OPTION =
            Target.the("cargo option")
                    .locatedBy("//span[text()='CARGO']");  
    public static Target SAVE_BUTTON =
            Target.the("save button")
                    .locatedBy("//span[text()='Save']");
}
