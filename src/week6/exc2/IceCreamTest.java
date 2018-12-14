package week6.exc2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class IceCreamTest {

    @Test
    void testConeIceCream() {
        ConeIceCream coneIceCream = new ConeIceCream("Chocolate", "Oreo");
        Assertions.assertEquals("The Chocolate ice-cream with Oreo is licked", coneIceCream.eat());
    }
    @Test
    void testCupIceCream() {
        CupIceCream cupIceCream = new CupIceCream("Vanilla", "Cookies");
        Assertions.assertEquals("The Vanilla ice-cream with Cookies is eaten with a spoon", cupIceCream.eat());
    }
}