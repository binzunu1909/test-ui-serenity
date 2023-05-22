package no.restaff.fresher.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class ResolveTargetElements implements Question<List<Target>> {

    private final Target target;

    private ResolveTargetElements(Target target) {
        this.target = target;
    }

    static ResolveTargetElements from(Target target) {
        return new ResolveTargetElements(target);
    }
    @Override
    public List<Target> answeredBy(Actor actor) {
//        TargetResolver resolver = new TargetResolver(actor);
//        return resolver.resolveAll(target);
    }
}
