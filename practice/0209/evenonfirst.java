import java.util.Scanner;

public class evenonfirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int evenwrite=0;
        int oddwrite=n-1;
        for(int read=0;read<n;read++)
        {
            if(arr[read] % 2==0)
            {
                arr[evenwrite]=arr[read];
                evenwrite++;
            }else{
                arr[oddwrite]=arr[read];
                oddwrite--;
            }
        }
        for(int X:arr)
        {
            System.out.print(X+" ");
        }

    }
}
