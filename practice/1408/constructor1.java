import java.util.Scanner;

class Employee {
    String name;
    String role;

    // Single-parameter constructor sets the name and defaults role to "Trainee"
    Employee(String name) {
        this.name = name;
        this.role = "Trainee";
    }

    // Display method to print details with correct line breaks
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Role: " + role);
    }
}

public class constructor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String name = scan.nextLine();
        
        Employee E = new Employee(name);
        E.display();
    }
}