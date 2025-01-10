package marketplace;

/**
 * Clothing is derived from {@link marketplace.Product Product}.
 */
public class Clothing extends Product {

    // TODO: Declare data members for size and material

    /**
     * Construct a new item of clothing.
     * @param name name of the item (e.g., shirt)
     * @param price cost
     * @param size size of the item
     * @param material material of the item
     */
    // TODO: Complete constructor
    // Hint: call the superclass constructor!

    /**
     * Return the item size
     * @return size (e.g., S, M, L)
     */
    public String getSize() {
        // TODO: Complete this method.
        return null;
    }

    /**
     * Calculate the final price of this item. For Clothing, the final price is the base price with a 5% tax.
     * @return price including 5% tax
     */
    @Override
    public double calculateFinalPrice() {
        // TODO: Complete this method.
        return 0;
    }

    /**
     * Returns a formatted string containing the product details and the details specific to the type Clothing.
     * The format of the result is as follows:
     * product_name - Size: product_size Price: product_price
     * example: Pants - Size: L Price: 75.99
     * @return a formatted string with product details
     */
    @Override
    public String getProductDetails() {
        // TODO: Complete this method.
        return null;
    }

}
