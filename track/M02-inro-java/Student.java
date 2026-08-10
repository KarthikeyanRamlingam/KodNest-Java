class Stud{  //void should in class through that method call through s1
    String name;
    int age;
    int rollno;

public void study()
{
    System.out.println("Studying");
}
 public void sleep()
 {
    System.out.println("sleeping");
    }
}
public class Student{

    public static void main(String[] args) {
        Stud s1=new Stud();
        s1.name="Salman";
        s1.age=21;
        s1.rollno=22;

        System.out.println("Name: "+s1.name);
        System.out.println("Age: "+s1.age);
        System.out.println("Roll No: "+s1.rollno);

        s1.study();
        s1.sleep();
        

        
        
    }
}