import java.util.*;
public class pract07{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the n value: ");
        int n=scan.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuseday");
                break;
            case 3:
                System.out.println("Wendsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        
    }
}