import  java.util.Scanner;
public class Revarr{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("size: ");
        int n=scan.nextInt();
        int[]arr=new int[n];

        for(int i=0;i<n;i++ )
        {
            System.out.print("Enter values: ");
            arr[i]=scan.nextInt();
        }
        System.out.println("array values: ");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }

    }
}