package week8.exc4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerLevelScouterTest {

    private PowerLevelScouter scouter = new PowerLevelScouter();
    private String name = "Susana";

    @Test
    void scout() {
        Integer scouted = scouter.scout(name);
        Integer expected = 619;
        Assertions.assertEquals(expected,scouted);
    }

    @Test
    void scoutEnhanced() {
        Integer scouted = scouter.scoutEnhanced(name);
        Integer expected = 651;
        Assertions.assertEquals(expected,scouted);
    }
}