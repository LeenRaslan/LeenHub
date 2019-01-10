package week8.exc4;

import java.util.function.Function;

public class PowerLevelScouter {

    public Integer getInteger(String name , Function<String,Integer> k) {
        Integer result = 0;
        String[] splitted = name.split("");
        for (String letter : splitted) {
            result += k.apply(letter);
        }
        return result;
    }

    public Integer scout(String name){

        return getInteger(name, e -> (int)e.charAt(0));
    }

    public Integer scoutEnhanced(String name) {

        return getInteger(name.toLowerCase(),e -> (int)e.charAt(0));
    }
}

