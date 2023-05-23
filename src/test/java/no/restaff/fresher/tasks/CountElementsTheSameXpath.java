package no.restaff.fresher.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class CountElementsTheSameXpath implements Question<Integer> {
    private final Target target;

    private CountElementsTheSameXpath(Target target) {
        this.target = target;
    }

    public static CountElementsTheSameXpath withXPath(Target target) {
        return new CountElementsTheSameXpath(target);
    }

    @Override
    public Integer answeredBy(Actor actor) {
        List<WebElementFacade> matchingElements = target.resolveAllFor(actor);
        return matchingElements.size();
    }

}
