import java.util.Scanner;

class CabBooking {
    String name;
    String type;
    int dis;
    int fare;

    // Quick Booking Constructor
    CabBooking(String name) {
        this.name = name;
        this.type = "Mini";
        this.dis = 5;
        this.fare = 75;
    }

    // Custom Booking Constructor
    CabBooking(String name, String type, int dis) {
        this.name = name;
        this.type = type;
        this.dis = dis;
        this.fare = dis * 15;
    }

    // Display method matching method name call in Main
    void display() {
        System.out.println("Passenger: " + name);
        System.out.println("Cab Type: " + type);
        System.out.println("Distance: " + dis + " km");
        System.out.println("Fare: Rs. " + fare);
    }
}

public class cabBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choose = scan.nextInt();
        scan.nextLine(); // consume remaining newline
        String name = scan.nextLine();

        if (choose == 1) {
            CabBooking QcB = new CabBooking(name);
            QcB.display();
        } else if (choose == 2) {
            String type = scan.nextLine();
            int dis = scan.nextInt();
            CabBooking cB = new CabBooking(name, type, dis);
            cB.display();
        }
    }
}