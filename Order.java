package ecommercesystem;
public class Order {
    private int customerId;
    private int orderId;
    private Product[]products;
    private float totalPrice;

    public Order(int customerId, int orderId ,Product[] products, float totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = Math.abs(totalPrice);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = Math.abs(totalPrice);
    }

    public void setOrderId(int orderId) {
        this.orderId = Math.abs(orderId);
    }
    
    public int getOrderId() {
    return orderId;
    }
    
    public void printOrderInfo(){
        System.out.println("Here's your order's summary:");
        System.out.println("Order's ID: "+orderId);
        System.out.println("Custommer's ID: "+customerId);
        System.out.println("Products: ");
         for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName() + " - $" + product.getPrice());
            }
        }
        System.out.println("Total price: $" + totalPrice);
    }
}
