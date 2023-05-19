package no.restaff.fresher.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ActivitiesPage {
    public static Target ADD_NEW_ACTIVITY_BUTTON =
            Target.the("add new activity button")
                    .locatedBy("//div/h6[text()='OS Activities Register Data']/parent::div/following-sibling::div//button[@title='Add new activity']");

    public static Target SEARCH_ACTIVITY_NAME_FIELD =
            Target.the("search activity name field")
                    .locatedBy("(//div/h6[text()='OS Activities Register Data']/parent::div/parent::div/following-sibling::div//div[text()='Name']/ancestor::thead/following-sibling::tbody//input)[count(//tr[@class='MuiTableRow-root MuiTableRow-head']//div[text()='Name']/ancestor::th/preceding-sibling::th)]");
    public static Target ACTIVITY_NAME_CREATED =
            Target.the("activity name created")
                    .locatedBy("//div/h6[text()='OS Activities Register Data']/parent::div/parent::div/following-sibling::div//div[text()='Name']/ancestor::thead/following-sibling::tbody//tr/td//div[contains(text(),'READY FOR TEST')]");

    public static Target DELETE_ACTIVITY_BUTTON =
            Target.the("delete activity button")
                    .locatedBy("//div/h6[text()='OS Activities Register Data']/parent::div/parent::div/following-sibling::div//div[text()='Name']/ancestor::thead/following-sibling::tbody//tr/td//div[contains(text(),'READY FOR TEST')]/ancestor::tr//button[@title = 'Delete Activity']");




}
