package reflection.week5;

import week5.exc6.Furniture;

import java.util.ArrayList;
import java.util.List;

public class TvTable implements Furniture {

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

