class parent{
    int a=10;
}
class child extends parent{
    int a=20;
    void display()
    {
        System.out.println(super.a);//control to parent
        System.out.println(a);
    }
}
public class Super{
    public static void main(String[] args) {
        child c=new child();
        c.display();
    }
}