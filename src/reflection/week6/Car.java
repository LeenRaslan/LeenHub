/*package reflection.week6;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class Car {

    public String brand;
    private Random random = new Random();

    public Car(String brand) {
        this.brand = brand;
    }

    public String drive(){
     return "I love this " + getNextCar();
    }

    List<Car> carKinds = Arrays.asList(new AutomaticCar("") , new ManualCar(""));

    public Car getNextCar(){
        int position = random.nextInt(2);
        Car carKind = carKinds.get(position);
        return carKind;
    }
}
*/