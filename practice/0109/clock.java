import java.util.Scanner;

public class clock {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr={10,20,30};
        int temp=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
             arr[i+1]=arr[i];     
        }
        arr[0]=temp;
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}