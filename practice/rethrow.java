import java.util.Scanner;
public class rethrow
{
    public static void main(String[] args) {
        
        System.out.println("Start rethrow exception");
        try{
            divide();
        }
        catch(Exception e)
        {
            System.out.println("main method handled");
        }
    }
    static void divide()
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
            int res=a/b;
            System.out.println(res);
        } catch (ArithmeticException e){
            System.out.println("rethrow handled");
            throw e;
        }
        finally{
            System.out.println("end the rethrow exception");
        }

    }
}