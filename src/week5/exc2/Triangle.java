package week5.exc2;

import week5.exc1.Shape;

public class Triangle implements Shape {
    @Override
    public String getName() {
        return "triangle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
