

abstract class parent{
    abstract void dis1();
    
    abstract void dis2();
}
class child1 extends parent{
    @Override
    void dis1(){
        System.out.println("child1 class display1");
    }
    @Override
    void dis2()
    {
        System.out.println("child1 class display2");
    }
}
class child2 extends parent{
    @Override
    void dis1(){
        System.out.println("child2 class display1");
    }
    @Override
    void dis2()
    {
        System.out.println("child2 class display2");
    }
}
public class Abstract{
    public static void main(String[] args) {
        child1 ch1=new child1();
        child2 ch2=new child2();
        
        accessmethod(ch1);
        accessmethod(ch2);
    }
    static void accessmethod(parent ref)
    {
        ref.dis1();
        ref.dis2();
    }
}