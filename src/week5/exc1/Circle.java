package week5.exc1;

public class Circle implements Shape {
    public Circle() {
        super();
    }

    @Override
    public String getName() {
        return "circle";
    }
    @Override
    public String toString() {
        return getName();
    }

}
