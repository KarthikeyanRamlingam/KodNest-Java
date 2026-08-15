class Student{
    String name;
    int age;
    double height;

    Student(){
        name=null;
        age=0;
        height=0.0;
    }

    Student(String name)
    {
        this.name=name;
    }
    Student(String name,int age,double height)
    {
        this.name=name;
        this.age=age;
        this.height=height;
    }

        void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);

    }
}
public class constructor{
    public static void main(String[] args) {
        //call
        Student s1=new Student();
        s1.display();
        Student s2=new Student("karthik");
        s2.display();
        Student s3=new Student("keyan",22,5.8);
        s3.display();
    }
}