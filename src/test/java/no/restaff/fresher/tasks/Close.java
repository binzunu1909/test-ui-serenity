package no.restaff.fresher.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Keys;

public class Close {
    public static Performable popup() {
        return Task.where("{0} close popup multiselection", actor->{
            //new Actions(getDriver()).moveByOffset(0, 200).click().build().perform();
            //BrowseTheWeb.as(actor).withAction().moveByOffset(0, 200).click().build().perform();
        });
    }
}
