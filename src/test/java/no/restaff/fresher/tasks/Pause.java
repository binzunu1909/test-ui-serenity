package no.restaff.fresher.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Pause {
    public static Performable second(int second) {
        return Task.where("{0} pause in " + second + "seconds", actor->{
            try {
                Thread.sleep(1000*second);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
