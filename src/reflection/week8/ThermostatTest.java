package reflection.week8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {

    private Thermostat thermostat = new Thermostat();
    Double tempreture = 12.3;

    @Test
    void sense() {
        
        Double actual = thermostat.sense(tempreture);




    }
}