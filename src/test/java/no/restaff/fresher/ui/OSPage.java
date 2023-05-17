package no.restaff.fresher.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OSPage {
    public static Target MENU_BUTTON = Target.the("menu button").located(By.className("jr-menu-icon"));
    public static Target REGISTER_DATA_MANAGER = Target.the("register data manager").locatedBy("//*[@id=\"body\"]/div[2]/div[3]/ul/li[2]/div[7]/div/div[2]");
    public static Target ACTIVITIES_MANAGER = Target.the("activities manager").locatedBy("//*[@id=\"body\"]/div[2]/div[3]/ul/li[2]/div[7]/div[2]/div/div/div/div[1]/div[1]/div[2]");
    public static Target ACTIVITIES = Target.the("activities").locatedBy("//a[@href='/app/admin/os/register-data-management/activities']");
    public static Target CATEGORIES = Target.the("categories").locatedBy("//a[@href='/app/admin/os/register-data-management/activity_categories']");

}
