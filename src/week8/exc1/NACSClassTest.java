/*package week8.exc1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class NACSClassTest {

    private NACSClass nacsClass = new NACSClass();
    private List<String> elements = Arrays.asList("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse");

    @Test
    void nClass() {
        Predicate<String> condition = element -> !element.endsWith("e");
        List<String> classTools = nacsClass.nClass(elements , condition);
        List<String> expected = Arrays.asList("scenario" , "glass" , "backpack");
        Assertions.assertEquals(expected , classTools);

        elements.replaceAll(e -> e.toUpperCase());
        Assertions.assertEquals("SCENARIO, GLASS, BACKPACK", classTools);
    }


}*/