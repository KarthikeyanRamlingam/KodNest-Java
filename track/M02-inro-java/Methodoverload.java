import java.util.Scanner;

// Printer class with overloaded show() methods
class Printer {
    // Print the number
    void show(int number) {
        System.out.println("Number: " + number);
    }

    // Print the word
    void show(String word) {
        System.out.println("Word: " + word);
    }
}

// Main class execution
public class Methodoverload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read one number and one word
        int num = scanner.nextInt();
        String word = scanner.next();

        // Create one Printer object
        Printer p1 = new Printer();

        // Call both show() methods
        p1.show(num);
        p1.show(word);

        scanner.close(); // Good practice to close the Scanner
    }
}