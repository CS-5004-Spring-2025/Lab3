package marketplace;

/**
 * Abstract class that represents a product in a marketplace.
 */
public abstract class Product {

    protected String name; // name of the product
    protected double price; // price of the product

    /**
     * Superclass constructor to build a new Product item.
     * @param name
     * @param price
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Final price will depend on the specific product, e.g., tax rate, cost of warranty.
     * @return
     */
    public abstract double calculateFinalPrice();

    /**
     * Return the name of the product.
     * @return name of the product
     */
    public String getProductDetails() {
        return name;
    }

}
