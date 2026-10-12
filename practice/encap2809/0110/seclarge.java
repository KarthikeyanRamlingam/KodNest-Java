// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;
class seclarge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,6,3,9,10,8};
        int lar=arr[0];
        int sec=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
            {
                if(arr[i]>lar)
                {
                    sec=lar;
                    lar=arr[i];
                }
                else if(arr[i]>sec && sec!=lar)
                {
                    sec=arr[i];
                }
            }
        System.out.print(sec);
    }
}