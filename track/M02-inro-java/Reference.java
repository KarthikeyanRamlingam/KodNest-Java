class Emp{
    int id;
    String name;
    void action()
    {
        System.out.println("working");    }
}
public class Reference{
    public static void main(String[] args) {
        Emp e1=new Emp();
        e1.id=01;
        e1.name="anu";
        System.out.println(e1.id);
        System.out.println(e1.name);
        e1.action();

        Emp e2;//new ref
        e2=e1;
        e2.id=02;
        e2.name="arun";
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);
    }
}