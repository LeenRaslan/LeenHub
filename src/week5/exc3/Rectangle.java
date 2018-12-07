package week5.exc3;

import week5.exc1.Shape;

public class Rectangle implements Colored, Shape {

    @Override
    public String getColor() {
        return "Black ";
    }

    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public String toString() {
        return getColor() + getName();
    }
}
