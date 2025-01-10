package marketplace;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ClothingTest {

    @Test
    void calculateFinalPriceSimple() {
        double expected = 105.0;
        Product clothing = new Clothing("Shirt", 100, "M", "Cotton");
        assertEquals(expected, clothing.calculateFinalPrice(), .1);
    }

    @Test
    void calculateFinalPriceComplex() {
        double expected = 14.95 * 1.05;
        Product clothing = new Clothing("Shirt", 14.95, "M", "Cotton");
        assertEquals(expected, clothing.calculateFinalPrice(), .1);
    }

    @Test
    void getProductDetails() {
        String expected = "Shirt - Size: M Price: 13.64";
        Product clothing = new Clothing("Shirt", 12.99, "M", "Cotton");
        assertEquals(expected, clothing.getProductDetails());

    }

    // TODO: Complete at least three additional JUnit test methods.
}
