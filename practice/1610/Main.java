

abstract class Person{
    protected int id;
    protected String name;
    protected int age;

    //initialize using constructor
    public Person(int id,String name,int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public void showDetails()
    {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    abstract  double  calculatePayment();

    abstract void displayRole();
}

class Student extends Person
{
    private String course;
    private double fee;
    //constructor
    public Student(int id, String name,int age,String course,double fee)
    {
        super(id, name, age);
        this.course=course;
        this.fee=fee;
    }
    @Override
    public double calculatePayment()
    {
        return fee;
    }
    @Override
    public void displayRole()
    {
        System.out.println("Role: Student");
    }
    @Override
    public void showDetails()
    {
        super.showDetails();
        System.out.println("Course: "+course);
    } 

}
//professor class
class Professor extends Person
{
    String subject;
    double salary;

    public Professor(int id,String name,int age,String subject,double salary)
    {
        super(id,name,age);
        this.subject=subject;
        this.salary=salary;
    }
    public double calculatePayment()
    {
        return salary;
    }
    @Override
    public void displayRole()
    {
        System.out.println("Role: Professor");
        System.out.println("Subject: "+subject);
    }
    public void showDetails()
    {
        super.showDetails();
        System.out.println("Subjet: "+subject);
    }
    
}
//admin
class Adminstaff extends  Person
{
    String department;
    double salary;

    public Adminstaff(int id,String name,int age,String department,double salary)
    {
        super(id,name,age);
        this.department=department;
        this.salary=salary;
    }
    @Override
    public void displayRole()
        {
            System.out.println("Role: Adminstaff");
            System.out.println("Department: "+department);
        }
    @Override
    public void showDetails()
    {
        super.showDetails();
        System.out.println("Department: "+department);
    }
}