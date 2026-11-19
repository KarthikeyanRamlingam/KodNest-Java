import java.util.Objects;
class Student{
    int roll;
    String name;
    // return true for same values
    @Override
    public boolean  equals(Object obj)
    {
        Student s=(Student)obj;
        if(this.roll==s.roll && this.name.equals(s.name))
        {
            return true;
        }else{
            return false;
        }
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(roll, name);
    }
    Student(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
    @Override
    public String toString()
    {
        return roll +" "+name;
    }
    void display()
    {
        System.out.println(roll);
        System.out.println(name);
    } 
}
public class version2equals{
    public static void main(String[] args) {
        Student s1=new Student(11,"karthik");
        Student s2=new Student(12,"raju");
        Student s3=new Student(11,"karthik");
        Object s4=new Student(13,"ravi");

        s1.display();
        s2.display();
        s3.display();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.getClass());
        System.out.println(s4.getClass());
    }
}