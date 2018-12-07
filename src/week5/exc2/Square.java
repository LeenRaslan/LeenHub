package week5.exc2;

import week5.exc1.Shape;

public class Square implements Shape {

    @Override
    public String getName() {
        return "square";
    }
    @Override
    public String toString() {
        return getName();
    }

}
