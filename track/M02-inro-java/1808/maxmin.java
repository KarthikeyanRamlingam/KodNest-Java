import java.util.Scanner;
public class maxmin{
    public static void main(String[] args) {
         Scanner scan =new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        int Max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>Max)
            {
                Max=arr[i];
            }
            else if (arr[i]<min){
                min=arr[i];
            }
            
        }

        System.out.println("max value: "+Max);
        System.out.println("min value: "+min);
    }
}