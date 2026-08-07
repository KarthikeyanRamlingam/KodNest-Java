import java.util.Scanner;

public class scannerprog{
    public static void main (String []args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter int value: ");
        int a=scan.nextInt();
        System.out.print("enter byte value: ");
        byte b =scan.nextByte();
        System.out.print("enter short value: ");
        short c =scan.nextShort();
        System.out.print("enter long value: ");
        long d =scan.nextLong();
        System.out.print("enter float value: ");
        float e =scan.nextFloat();
        System.out.print("enter Double value: ");
        Double f =scan.nextDouble();
        System.out.print("enter boolean value: ");
        boolean g =scan.nextBoolean();

        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);
        System.out.println("value of c: "+c);
        System.out.println("value of d: "+d);
        System.out.println("value of e: "+e);
        System.out.println("value of f: "+f);
        System.out.println("value of g: "+g);
        
        scan.close();
    }
}