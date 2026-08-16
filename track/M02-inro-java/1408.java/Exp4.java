import java.util.Scanner;

class FoodOrder {
    String item;
    int quantity;

    // Single-parameter constructor: sets item and defaults quantity to 1
    FoodOrder(String item) {
        this.item = item;
        this.quantity = 1;
    }

    // Two-parameter constructor: stores both item and quantity
    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    // Display order details
    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class Exp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read item name and quantity from user input
        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        // Create order using single-parameter constructor
        FoodOrder f = new FoodOrder(item);

        // Create order using two-parameter constructor
        FoodOrder f1 = new FoodOrder(item, quantity);

        // Display output for both orders
        f.display();
        f1.display();
    }
}