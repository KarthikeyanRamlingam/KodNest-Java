import java.util.Scanner;
public class Scanprog {
    public static void main (String[] args){
         
        Scanner can=new Scanner(System.in);
        System.out.print("enter the name: ");
        String a=can.nextLine();
        System.out.print("enter the age: ");
        int b=can.nextInt();
        System.out.print("enter the height: ");
        float c=can.nextFloat();
        System.out.println("name: "+a);
        System.out.println("age: "+b);
        System.out.print("height: "+c);
    }
}