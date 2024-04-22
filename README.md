Project1:

This is a simple E-Commerce system program in Java that models different types of products and their interactions with customers. It consists of several classes to represent products, customers, shopping carts, and orders.

Classes:

Product: Represents a generic product with attributes such as ID, name, and price.
ElectronicProduct: Subclass of Product, representing electronic products with additional attributes like brand and warranty period.
ClothingProduct: Subclass of Product, representing clothing products with attributes like size and fabric.
BookProduct: Subclass of Product, representing book products with attributes like author and publisher.
Customer: Represents a customer with attributes such as ID, name, and address.
Cart: Represents a shopping cart for a customer with methods to add/remove products, calculate total price, and place orders.
Order: Represents an order placed by a customer with attributes like customer ID, order ID, products, and total price.
EcommerceSystem: Entry point for the program with a main method to demonstrate the usage of other classes.

Usage

Create instances of ElectronicProduct, ClothingProduct, and BookProduct to represent different types of products.
Create a Customer instance with customer ID, name, and address.
Create a Cart instance for the customer and add products to the cart.
Place an order for the products in the cart.
Print order information.
