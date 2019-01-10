package week8.exc2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {

    public List<Integer> filter(List<Integer> numbers, Predicate<Integer> condition) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if (condition.test(number)) {
                filtered.add(number);
            }
        }
        return filtered;
    }

    public List<Integer> getOddNumber(List<Integer> numbers){
        return filter(numbers,e -> e%2 == 1);
    }
    public List<Integer> getEvenNumber(List<Integer> numbers){
        return filter(numbers,e -> e%2 == 0);
    }

}

