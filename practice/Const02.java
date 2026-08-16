import java.util.Scanner;

class Employee {
    int id;
    String name;
    String dept;

    // Parameterized constructor to initialize instance variables
    Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    // Method to display stored profile details
    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + dept);
    }
}

public class Const02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int id = scan.nextInt();
        scan.nextLine(); // Consume remaining newline character
        String name = scan.nextLine();
        String dept = scan.nextLine();

        Employee E = new Employee(id, name, dept);
        E.display();
    }
}