class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    // Constructor
    Product(int id, String name, double price, int qty) {
        this.productId = id;
        this.productName = name;
        this.price = price;
        this.quantity = qty;
    }

    // Display product
    void displayProduct() {
        System.out.println(productName + " - ₹" + price + " x " + quantity + 
                           " = ₹" + (price * quantity));
    }
}