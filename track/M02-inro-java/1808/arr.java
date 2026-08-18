import java.util.Scanner;
public class arr{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("sum: "+sum);
    }
}