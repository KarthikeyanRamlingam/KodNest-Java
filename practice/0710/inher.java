class parent{
    void disp1(){
        System.out.println("parent disp1");
    }
    void disp2(){
        System.out.println("parent display 2");
    }
}
class child extends parent {
    @Override
    void disp2()
    {
        System.out.println("child display 3");
    }
    void disp3()
    {
        System.out.println("child diplay3");
    }
}
public class inher{
    public static void main(String []args)
    {
        child c1=new child();
        c1.disp1();
        c1.disp2();
        c1.disp3();
    }
}