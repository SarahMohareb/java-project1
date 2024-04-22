E-Commerce System
This project implements a simple e-commerce system in Java. It allows users to interact with the system through a command-line interface (CLI) to perform various tasks such as adding products to a cart, calculating total prices, and placing orders.

Project Structure
The project consists of several Java classes organized into packages:

ecommercesystem - Contains the main classes and logic for the e-commerce system.
ECommerceSystem.java: Main class that orchestrates the system's functionality.
Cart.java: Represents a shopping cart and contains methods for managing products and calculating prices.
Order.java: Represents an order and contains methods for printing order information.
Customer.java: Represents a customer with basic information such as ID, name, and address.
Product.java: Abstract class representing a product with common attributes such as ID, name, and price.
ElectronicProduct.java, ClothingProduct.java, BookProduct.java: Subclasses of Product representing different types of products.
gui - Contains a Swing-based GUI implementation of the e-commerce system.
ECommerceGUI.java: Swing GUI class providing a graphical interface for users to interact with the system.
How to Run
Command-Line Interface (CLI)
To run the e-commerce system using the CLI:

Compile all Java files in the project.
Execute the ECommerceSystem class's main method.
Graphical User Interface (GUI)
To run the e-commerce system using the GUI:

Compile all Java files in the project.
Execute the ECommerceGUI class's main method.
Usage
Command-Line Interface (CLI)
Upon running the application, users are prompted to enter their ID, name, address, and the number of products they want to add to their cart.
Users can then choose from available products (smartphone, T-shirt, OOP book) and add them to their cart.
After adding products, users can choose to calculate the total price or place an order.
If the order is placed, the system displays the order ID and details.
Graphical User Interface (GUI)
The GUI presents users with fields to enter their ID, name, and address, and a dropdown to select products.
Users can add products to their cart, calculate the total price, and print order information using corresponding buttons.
The GUI provides visual feedback and displays order details in a dialog box.
