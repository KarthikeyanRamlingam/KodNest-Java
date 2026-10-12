class parent{
    parent()
    {
        System.out.println("par 0 const");
    }
    parent(int a)
    {
        System.out.println("par 1 const"+ a);
    }
}
class child extends  parent
{
    child()
    {
        super(10);//global chain constructor
        System.out.println("child 0 constr");
    }
    child(int a)
    {
        this(10,20);//local chain constructor 
        System.out.println("child 1-par constr");
    }
    child(int a,int b)
    {
        System.out.println("child 2-par const"+a+b);
    }
}
public class main
{
    public static void main(String[] args) {
        child c=new child();
        child c1=new child(10);
    }
}