package week6.exc3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {

    private static List<CoffeeMaker> coffeeMakers = Arrays.asList(new AutomaticCoffeeMachine(),new FrenchPress(),new AutoDrip());

    public static List<CoffeeMaker> asList(){
        return coffeeMakers;
    }
    public static Optional<CoffeeMaker> get(String coffeeName){
        List<CoffeeMaker> coffeeMaker = coffeeMakers;
        for (CoffeeMaker maker : coffeeMaker) {
            if (maker.getName().contains(coffeeName)){
                return Optional.of(maker);
            }
        }return Optional.empty();
    }
}
