import java.util.Scanner;
class Employee {
    // Instance variables
    String name;
    double salary;

    // Method to set employee details
    void setDetails(String name, double salary) {
        String Empname = name;
        double empsalary = salary;
        
        // Note: To save directly to class variables above, use:
        // this.name = name;
        // this.salary = salary;
    }

    // Method to display details
    void displayDetails(String name, double salary) {
        // Print the stored name and salary
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
public class Emplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user input
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();

        // Create Employee object
        Employee e1 = new Employee();

        // Call setDetails() and displayDetails()
        e1.setDetails(name, salary);
        e1.displayDetails(name, salary);

        scanner.close(); // Good practice to close the Scanner
    }}