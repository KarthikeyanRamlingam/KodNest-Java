public class Exceptionhandle
{
    public static void main(String[] args) {
        try {
            int a=10;
            int b=0;
            int res=a/b; 
            System.out.println(res);
        }catch (Exception e) 
        {
            System.out.println("Exception handled");
            System.out.println(e.getMessage());
        }
    }
}