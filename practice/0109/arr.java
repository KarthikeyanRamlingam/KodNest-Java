import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr={10,20,40,50};
        int index=scan.nextInt();
        int element=scan.nextInt();
        int[] arr2=new int[arr.length+1];
        for(int i=0,j=0;i<arr2.length;i++)
        {
            if(i==index)
            {
                arr2[i]=element;
            }else{
                arr2[i]=arr[j++];
            }
        }
        for(int x:arr2)
        {
            System.out.print(x+" ");
        }
    }
}