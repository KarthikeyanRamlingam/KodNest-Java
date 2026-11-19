class girl{
    girl(){
        System.out.println("I cant live without you");  
    }
    void beauty()
    {
        System.out.println("I love you!<3");
    }
}
class boy{
    girl dolly= new girl();

    boy()
    {
        System.out.println("karthik");
    }    
}
public class hasa
{
    public static void main(String[] args) {
        boy rich=new boy();
        rich.dolly.beauty();
        rich=null;
        rich.dolly.beauty();
    }
}