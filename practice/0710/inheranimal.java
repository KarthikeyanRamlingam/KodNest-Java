class animal{
    void eat()
    {
        System.out.print("eating");
    }
    void sleep()
    {
        System.out.println("sleeping");
    }
}
class monkey extends animal
{
    @Override
    void eat(){
        System.out.println("steal and eat");
    }
}
class tiger extends animal
{
    void eat()
    {
        System.out.println("hunt and eat");
    }
}
public class inheranimal{
    public static void main(String[] args) {
        monkey m=new monkey();
        m.eat();
        tiger t=new tiger();
        t.eat();
    }
}