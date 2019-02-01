package week11.exc2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class HoursFormatTest {

    HoursFormat format = new HoursFormat();

    @Test
    void toMilitaryTime() {
        String expected = "20:05:45";
        String actual = format.toMilitaryTime("08:05:45PM");
        Assertions.assertEquals(expected,actual);
    }
}