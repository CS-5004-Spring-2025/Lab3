# Lab 3 - MarketPlace
### Due - Friday, January 31, 11:59pm

Assignment Link:
[https://classroom.github.com/a/AZQjSR3h](https://classroom.github.com/a/AZQjSR3h)

In this assignment, you will practice with inheritance and polymorphism.

<hr/>

## Program Operation

The goal of this program is to build the class structure to support an online market place. The `main` method will test the code you develop by creating several instances and invoking methods as specified. Your goal is not to produce an end-to-end program with any specific functionality, but rather to implement the classes used to store the appropriate data. The code you will implement in `main` is designed to give you practice with using polymorphism.

## Program Design

The starter code includes Javadoc describing the classes and methods you must implement. You are responsible for implementing the following methods as described in the starter
code documentation:

### `Product`
`Product` is an *abstract* class that has been provided for you. All products have a name and a price, and any implementing classes must specify how the final price of a particular type of product must be calculated. Product prices differ in the tax calculated and whether there is a warranty fee. 

### `Constants`
`Constants` is a helper class that has been provided for you.

### `ConsoleView`
`ConsoleView` is a helper class that has been provided for you.

### `Clothing`
`Clothing` is a specific type of `Product`. The final price of an item of clothing is calculated as the base price with a 5% tax. `Clothing` also has an associated size property. You are required to implement the following:
- Define required data members.
- `Constructor`
- `getSize`
- `calculateFinalPrice`
- `getProductDetails`

### `Electronics`
`Electronics` is a specific type of `Product`. The final price of an electronics item is calculated as the base price with a 5% tax and a $50 warranty fee. Electronics items also have a warranty years property. You are required to implement the following:
- Define required data members.
- `Constructor`
- `getWarranty`
- `calculateFinalPrice`
- `getProductDetails`

### `MarketPlace`
- Implement manual testing code in the `main` method as described. You will create a list of products, display all items of clothing with size M, and display all electronics items with a warranty of less than three years.

### Tests

You must implement at least three unit tests for `Clothing` and three for `Electronics`.

In addition to implementing the methods exactly as described, you are also expected to use the provided methods and data members where appropriate.
