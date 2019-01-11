package reflection.week8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {

    public String sense (Double temperature, Predicate<Double> condition, Function<Double,String> display) {

            if (condition.test(temperature)) {
                return "WARNING!";
            }

        return display.apply(temperature);
    }
}
