import java.util.Scanner;

public class scanprog3 {
    public static void main (String []args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the char value: ");
        char a = s.next().charAt(2);
        System.out.print("the char value is: " + a);
        
        s.close();
    }
}