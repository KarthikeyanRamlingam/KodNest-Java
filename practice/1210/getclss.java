import java.util.Objects;
class student {

    int id;
    String name;

    @Override
    public String toString() {
        return id + " " + name;
    }
    @Override
    public boolean equals(Object obj)
    {
        //downcasting
        student s=(student)obj;
        if(this.id==s.id && this.name==s.name)
        {
            return true;
        }else{
            return false;
        }
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(id,name);
    }

    void set(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(name + " " + id);
    }
}

public class getclss {

    public static void main(String[] args) {
        student s1 = new student();
        Object obj = s1;
        s1.set(01, "sheela");
        student s2 = new student();
        s2.set(01, "sheela");
        s1.display();
        s2.display();
        //current runnind class
        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getSimpleName());
        //address
        System.out.println(s1);
        System.out.println(s1.equals(s2));
        //hashcode
        System.out.println(s1.hashCode()==s2.hashCode());
    }
}
