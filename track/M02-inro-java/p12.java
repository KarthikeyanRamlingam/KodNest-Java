import java.util.Scanner;
public class p12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start=scanner.nextInt();
        int end =scanner.nextInt();
        int a=0;
        int b=0;
        for (int i =start;i<=end;i++){
        if(i%2==0){
        a+=i;
        }
        else{
        b++;
        }
        }
        System.out.println("Even sum: "+a);
        System.out.print("Odd count: "+b);
        scanner.close();
    }
}