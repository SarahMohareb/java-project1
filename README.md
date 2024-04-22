E-COMMERCE SYSTEM:
This project implements a simple e-commerce system in Java. It allows users to interact with the system through a command-line interface (CLI) to perform various tasks such as adding products to a cart, calculating total prices, and placing orders.

PROJECT STRUCTURE:
The project consists of several Java classes organized into packages

CLASSES:
Product: Represents a generic product with attributes such as ID, name, and price.
ElectronicProduct: Subclass of Product, representing electronic products with additional attributes like brand and warranty period.
ClothingProduct: Subclass of Product, representing clothing products with attributes like size and fabric.
BookProduct: Subclass of Product, representing book products with attributes like author and publisher.
Customer: Represents a customer with attributes such as ID, name, and address.
Cart: Represents a shopping cart for a customer with methods to add/remove products, calculate total price, and place orders.
Order: Represents an order placed by a customer with attributes like customer ID, order ID, products, and total price.
EcommerceSystem: Entry point for the program with a main method to demonstrate the usage of other classes.
ECommerceGUI: Swing GUI class providing a graphical interface for users to interact with the system.

USAGE:
Create instances of ElectronicProduct, ClothingProduct, and BookProduct to represent different types of products.
Create a Customer instance with customer ID, name, and address.
Create a Cart instance for the customer and add products to the cart.
Place an order for the products in the cart.
Print order information.

EXAMPLE:
// Create electronic product
ELectronicProduct smartphone = new ELectronicProduct("smartphone", 1 , 1 , "Samsung", 599.99f);

// Create clothing product
ClothingProduct tShirt = new ClothingProduct("Medium", "Cotton", 2, "T-shirt", 19.99f);

// Create book product
BookProduct oopBook = new BookProduct("O'Reilly", "X Publications", 3, "OOP", 39.99f);

// Create customer
Customer customer = new Customer(23010121, "Rewan Mostafa", "SidiBeshr, Alexandria");

// Create shopping cart
Cart cart = new Cart(id, nProducts, products);
cart.addProduct(electronicProduct);
cart.addProduct(clothingProduct);
cart.addProduct(bookProduct);

// Place order
cart.placeOrder();

// Print order info
Order order = new Order(customer.getCustomerId(), 1, cart.getProducts(), cart.calculatePrice());
order.printOrderInfo();

COMMAND LINE INTERFACE(CLI):
Upon running the application, users are prompted to enter their ID, name, address, and the number of products they want to add to their cart.
Users can then choose from available products (smartphone, T-shirt, OOP book) and add them to their cart.
After adding products ,users can choose to calculate the total price , place an order or not and remove products.
If the order is placed, the system displays the order ID and details.

GRAPHICAL USER INTERFACE(GUI):
The GUI presents users with fields to enter their ID, name, and address, and a dropdown to select products.
Users can add products to their cart, calculate the total price, and print order information using corresponding buttons.
The GUI provides visual feedback and displays order details in a dialog box.
