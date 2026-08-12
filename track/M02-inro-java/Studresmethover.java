import java.util.Scanner;

class ResultCalculator {
    // Return the total of two marks
    int getTotal(int first, int second) {
        return first + second;
    }

    // Return the total of three marks
    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}

public class Studresmethover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three marks
        int F = scanner.nextInt();
        int S = scanner.nextInt();
        int T = scanner.nextInt();

        // Create one ResultCalculator object
        ResultCalculator r = new ResultCalculator();

        // Call both overloaded methods and print both totals
        System.out.println("Two-Mark Total: " + r.getTotal(F, S));
        System.out.println("Three-Mark Total: " + r.getTotal(F, S, T));
    }
}