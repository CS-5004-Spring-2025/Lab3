package marketplace;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ElectronicsTest {

    @Test
    void calculateFinalPriceSimple() {
        double expected = 1100.0;
        Product electronics = new Electronics("iPad", 1000, 2);
        assertEquals(expected, electronics.calculateFinalPrice(), .1);
    }

    @Test
    void calculateFinalPriceComplex() {
        double expected = (1445 * 1.05) + 50;
        Product electronics = new Electronics("iPad", 1445, 2);
        assertEquals(expected, electronics.calculateFinalPrice(), .1);
    }

    @Test
    void getProductDetails() {
        String expected = "iPad - Years of Warranty: 2 Price: 1100.00";
        Product electronics = new Electronics("iPad", 1000, 2);
        assertEquals(expected, electronics.getProductDetails());

    }

    // TODO: Complete at least three additional JUnit test methods.
}
