import java.util.Scanner;
class Student{
    String name;

    Student(String name){
        this.name=name;

    }
    void display()
    {
        System.out.print("name: "+name);
    }
}
public class Exp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the full name line and instantiate Student directly
        Student s = new Student(scanner.nextLine());

        // Display the output
        s.display();
    }
}