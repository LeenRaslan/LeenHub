package week8.exc3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeywordFinderTest {

    private KeywordFinder finder = new KeywordFinder();
    private String sentence = ("The elephant is lifted eleven floors easily with the help of an electricity elevator");
    private String sentence1 = ("The rightful heir of the powerful king had an awful accident playing with a colorful bear");

    @Test
    void finder() {
    }

    @Test
    void findElegant() {
        List<String> found = finder.findElegant(sentence);
        List<String> expected = Arrays.asList("elephant", "eleven", "electricity", "elevator");
        Assertions.assertEquals(expected,found);
    }

    @Test
    void findPlayful() {
        List<String> found = finder.findPlayful(sentence1);
        List<String> expected = Arrays.asList("rightful", "powerful", "awful", "colorful");
        Assertions.assertEquals(expected,found);
    }
}