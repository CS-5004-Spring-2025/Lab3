package marketplace;

/**
 * Electronics is derived from {@link marketplace.Product Product}.
 */
public class Electronics extends Product {

    // TODO: Declare a data member for the warranty years


    /**
     * Construct a new electronics item.
     * @param name name of the item (e.g., iPad)
     * @param price cost
     * @param warranty years of warranty
     */
    // TODO: Complete constructor
    // Hint: call the superclass constructor!

    /**
     * Return the years of warranty
     * @return warranty in years
     */
    public int getWarranty() {
        // TODO: Complete this method.
        return 0;
    }

    /**
     * Calculate the final price of this item. For Electronics, the final price is
     * the base price with a 5% tax and a $50 warranty charge.
     * @return price including 5% tax and $50 warranty
     */
    @Override
    public double calculateFinalPrice() {
        // TODO: Complete this method.
        return 0;
    }

    /**
     * Returns a formatted string containing the product details and the details
     * specific Electronics item. The format of the result is as follows:
     * product_name - Years of Warranty: warranty Price: product_price
     * example: iPad - Years of Warranty: 2 Price: 1100.0
     * @return a formatted string with product details
     */
    public String getProductDetails() {
        // TODO: Complete this method.
        return null;
    }

}
