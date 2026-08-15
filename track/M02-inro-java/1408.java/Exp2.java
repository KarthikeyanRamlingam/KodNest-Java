import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        // Store both values
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class Exp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values separately to avoid parameter issues
        // String name = scanner.nextLine();
        // double price = scanner.nextDouble();

        // Create one Product object
        Product p = new Product(scanner.nextLine(),scanner.nextDouble());

        // Call display()
        p.display();
    }
}