import java.util.Scanner;

class Student {
    String name;

    // Store the parameter in the instance variable
    void setName(String name) {
        this.name = name;
    }

    // Print the stored name
    void showName() {
        System.out.println("Student Name: " + name);
    }

    // Print the first score
    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    // Print the total of two scores
    void showScore(int first, int second) {
        System.out.println("Two-Score Total: " + (first + second));
    }
}

public class StudscoreMO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name and two scores
        String name = scanner.nextLine();
        int f = scanner.nextInt();
        int s = scanner.nextInt();

        // Create one Student object
        Student S = new Student();

        // Store and print the name
        S.setName(name);
        S.showName();

        // Call both showScore() methods
        S.showScore(f);
        S.showScore(f, s);
    }
}