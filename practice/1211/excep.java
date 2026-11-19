
import java.util.Scanner;

public class excep {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Start exception");
        int age=sc.nextInt();
        try {
            eligible(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("end");
        }
    }

    static void eligible(int age) throws Exception {
        if (age<18)
        {
            throw new Exception("not eligible");
        }else{
            System.out.println("Eligible");
        }
    }
}
