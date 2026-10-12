// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;
class zeroatend{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={0,2,0,0,5,6,0,9};
        int j=0;
        for(int i=0;i<arr.length;i++)
            {
                if(arr[i]!=0)
                {
                    arr[j]=arr[i];
                    j++;
                }
            }
        while(j<arr.length)
            {
                arr[j]=0;
                j++;
            }
        for(int x:arr)
            {
                System.out.print(x+" ");
            }
    }
}