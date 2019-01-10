package week8.exc2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class NumberFilterTest {

    private NumberFilter filter = new NumberFilter();
    private List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    @Test
    void filter() {
        Predicate<Integer> condition = number -> !number.equals(10);
        List<Integer> filtered = filter.filter(numbers,condition);
        List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Assertions.assertEquals(expected,filtered);
    }

    @Test
    void getOddNumber() {
        List<Integer> filtered = filter.getOddNumber(numbers);
        List<Integer> expected = Arrays.asList(1,3,5,7,9);
        Assertions.assertEquals(expected,filtered);
    }

    @Test
    void getEvenNumber() {
        List<Integer> filtered = filter.getEvenNumber(numbers);
        List<Integer> expected = Arrays.asList(2,4,6,8,10);
        Assertions.assertEquals(expected,filtered);
    }
}