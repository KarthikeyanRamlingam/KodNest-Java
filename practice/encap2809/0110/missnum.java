// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;
class missnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,9};
        int n=arr[arr.length-1];
        int act=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++)
            {
                sum+=arr[i];
            }
        System.out.print(act-sum);
    }
}