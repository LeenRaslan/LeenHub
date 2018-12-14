package reflection.week6;

public class CarApplication {
    public static void main(String[] args) {

        Hansel hansel = new Hansel();
        AutomaticCar automaticCar = new AutomaticCar("Audi");
        hansel.haveATry(automaticCar);
    }
}
