import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    cart.addProduct(new Product(id, name, price, qty));
                    break;

                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = sc.nextInt();
                    cart.removeProduct(removeId);
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    double total = cart.calculateTotal();
                    double discount = total * 0.10;
                    double tax = (total - discount) * 0.05;
                    double finalAmount = total - discount + tax;

                    System.out.println("\nTotal: ₹" + total);
                    System.out.println("Discount: ₹" + discount);
                    System.out.println("Tax: ₹" + tax);
                    System.out.println("Final Amount: ₹" + finalAmount);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}