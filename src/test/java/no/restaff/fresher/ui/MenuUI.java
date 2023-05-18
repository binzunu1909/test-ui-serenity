package no.restaff.fresher.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuUI {
    public static Target MENU_BUTTON =
            Target.the("menu button")
                    .located(By.className("jr-menu-icon"));
    public static Target MENU_ITEM =
            Target.the("{0} menu item")
                    .locatedBy("//div[text()='{0}']");

    public static Target REGISTER_DATA_MANAGER_ITEM = MENU_ITEM.of("Register Data Manager");
    public static Target ACTIVITIES_MANAGER_ITEM =
            Target.the("Activities Item")
                    .locatedBy("//div[text()='Activities']");
    public static Target ACTIVITIES_ITEM =
            Target.the("Activities Sub-Item")
                    .locatedBy("//div//a[@href='/app/admin/os/register-data-management/activities']");
    public static Target CATEGORIES_ITEM = MENU_ITEM.of("Categories");

}
