package week6.exc3;

public abstract class CoffeeMaker {

    public abstract String getName();

    public abstract Integer getBrewingTime();

    public Coffee brew(){
        Coffee coffee = new Coffee(getName(),getBrewingTime());
        return coffee;
    }
}
