package no.restaff.fresher.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Random;

public class ChooseRandom {

    public static Performable theItemOfSelectionList(Target target, Target target1) {
        return Task.where(actor->{
            Random random = new Random();
            int totalItems = actor.asksFor(CountElementsTheSameXpath.withXPath(target));
            String randomPosition = String.valueOf(random.nextInt(totalItems));
            Click.on(target1.of(randomPosition));
        });
    }
}
