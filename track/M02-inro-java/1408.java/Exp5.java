import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    // No-arg constructor: sets planName to "Basic" and price to 199
    MobilePlan() {
        this.planName = "Basic";
        this.price = 199;
    }

    // Parameterized constructor: stores selected planName and price
    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    // Display method to output plan details
    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class Exp5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the selected plan name and price
        String plan = scanner.nextLine();
        int price = scanner.nextInt();

        // Create default plan using non-parameterized constructor
        MobilePlan m = new MobilePlan();

        // Create selected plan using parameterized constructor
        MobilePlan m1 = new MobilePlan(plan, price);

        // Display details for both plans
        m.display();
        m1.display();
    }
}