import java.util.Scanner;

class Employee {
    // Declare instance variables
    int employeeid;
    String employeeName;
    double basicSalary;
    double bonus;
    // Write the zero-parameter constructor
    Employee()
    {
        this.employeeid=0;
        this.employeeName="";
        this.basicSalary=0.0;
        this.bonus=0.0;
    }
    // Write the parameterized constructor
    Employee(int employeeid,String employeeName,double basicSalary,double bonus)
    {
        this.employeeid=employeeid;
        this.employeeName=employeeName;
        this.basicSalary=basicSalary;
        this.bonus=bonus;
    }
    void setEmployeeDetails(int employeeid,String employeeName,double basicSalary)
    {
        this.employeeid=employeeid;        
        this.employeeName=employeeName;        
        this.basicSalary=basicSalary;        
        this.bonus=0.0;
    }
    void addBonus(double bonusAmount)
    {
        this.bonus=bonusAmount;
    }
    void addBonus(double bonusPercentage,double extraReward)
    {
        double percentageBonus=this.basicSalary*bonusPercentage/100;
        double additionBonus=percentageBonus+extraReward;
        this.bonus+=additionBonus;
    }
    double calculateTotalSalary()
    {
        double totalSalary=this.basicSalary+this.bonus;
        return totalSalary;
    }
    void displayEmployee()
    {
        System.out.println("Employee ID: "+employeeid);
        System.out.println("Employee Name: "+employeeName);
        System.out.println("Basic Salary: "+basicSalary);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+(calculateTotalSalary()));

    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first employee details
        int id=scanner.nextInt();
        scanner.nextLine();
        String name=scanner.nextLine();
        double salary=scanner.nextDouble();
        double bonus=scanner.nextDouble();
        // Create and update the first Employee object
        Employee E1=new Employee();
        E1.setEmployeeDetails(id,name,salary);
        E1.addBonus(bonus);
        // Read the second employee details
        int id2=scanner.nextInt();
        scanner.nextLine();
        String name2=scanner.nextLine();
        double salary2=scanner.nextDouble();
        double bonus2=scanner.nextDouble();
        double bonusper=scanner.nextDouble();
        double reward=scanner.nextDouble();
        Employee E2=new Employee(id2,name2,salary2,bonus2);
        E2.addBonus(bonusper,reward);
        // Create and update the second Employee object
        // Display both employees
        System.out.println("Employee 1");
        E1.displayEmployee();
        System.out.println();
        System.out.println("Employee 2");
        E2.displayEmployee();
    }
}