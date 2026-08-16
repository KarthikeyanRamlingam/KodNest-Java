import java.util.Scanner;

class Book {
    String title;
    String author;

    // Constructor to store title and author using 'this'
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Display method to output details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Exp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input and pass directly to Book constructor
        Book b = new Book(scanner.nextLine(), scanner.nextLine());

        // Display the details
        b.display();
    }
}