class parent{
    void dep()
    {
        System.out.println("developer");
    }
    void framework()
    {
        System.out.println("spring/dango");
    }
}
class child1 extends parent{
    @Override
    void dep()
    {
        System.out.println("java dev");
    }
    @Override
    void framework(){
        System.out.println("spring boot");
    }
    void use()
    {
        System.out.println("more secure and WORA");
    }
}
class child2 extends parent{
    @Override
    void dep()
    {
        System.out.println("python dev");
    }
    @Override
    void framework(){
        System.out.println("Django");
    }
    void use()
    {
        System.out.println("AI model,simple syntax");
    }
}
public class runtimepoly{
    public static void main(String[] args) {
        child1 ch1=new child1();
        child2 ch2=new child2();
        accessmod(ch1);
        accessmod(ch2);
    }
    public  static void accessmod(parent pr)
    {
        pr.dep();
        pr.framework();
        if(pr instanceof child1)
        {
            ((child1) (pr)).use();
        }else{
            ((child2) (pr)).use();
        }
    }
}