class demo
{
    static 
    {
        System.out.println("1st execution");
    }
    static 
    {
        System.out.println("2st execution");
    }
    static 
    {
        System.out.println("3st execution");
    } 
    {
        System.out.println("execution");
    }
    {
        System.out.println("execution");
    }
}

public class staticblock
{
    public static void main(String[] args) {
        demo d1=new demo();
        demo d2=new demo();
        demo d3=new demo();
    }
}