import java.util.ArrayList;

class Cart {
    ArrayList<Product> products = new ArrayList<>();

    // Add product
    void addProduct(Product p) {
        products.add(p);
        System.out.println("Product added!");
    }

    // Remove product
    void removeProduct(int id) {
        boolean found = false;

        for (Product p : products) {
            if (p.productId == id) {
                products.remove(p);
                found = true;
                System.out.println("Product removed!");
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found!");
        }
    }

    // Display cart
    void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }

        for (Product p : products) {
            p.displayProduct();
        }
    }

    // Calculate total
    double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }
}