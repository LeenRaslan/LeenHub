package week5.exc6;

import java.util.ArrayList;
import java.util.List;

public class Wardrobe implements Furniture {

    List<String> parts = new ArrayList<>();

    @Override
    public void add(String part) {
        parts.add(part);
    }

    @Override
    public String toString() {
        System.out.println(parts);
        return toString();
    }
}
