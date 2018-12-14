package week6.exc3;
import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {

    public static void main(String[] args) {
        List<CoffeeMaker> coffeeMaker = CoffeeMakers.asList();
        for (CoffeeMaker maker : coffeeMaker) {
            Coffee coffee = maker.brew();
            System.out.println(coffee.getMadeBy()+"brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");

        }
        System.out.println("");

        checkCoffee("French press");
        checkCoffee("Automatic coffe machine");
        checkCoffee("Auto drip");
        checkCoffee("Moka pot");

    }

    private static void checkCoffee(String name) {
        Optional<CoffeeMaker> coffeeMaker = CoffeeMakers.get(name);
        if (coffeeMaker.isPresent()) {
            coffeeMaker.get().brew();
            System.out.println(coffeeMaker.get().getName() + " brewed a coffee and it took " + coffeeMaker.get().getBrewingTime() + " minutes");
        } else
            System.out.println("The coffee maker with the name " + name + " pot is not available");
    }


}
