package no.restaff.fresher.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ActivitiesPage {
    public static Target ADD_NEW_ACTIVITY_BUTTON =
            Target.the("add new activity button")
                    .locatedBy("//div/h6[text()='OS Activities Register Data']/parent::div/following-sibling::div//button[@title='Add new activity']");

    public static Target SEARCH_ACTIVITY_NAME_FIELD =
            Target.the("search activity name field")
                    .locatedBy("//div[@class='jss2907']//table//td[1]//input");
    public static Target ACTIVITY_NAME_CREATED =
            Target.the("activity name created")
                    .locatedBy("//div[@class='jss2907']//tr[2]//td//div[text()='READY FOR TEST']");
}
