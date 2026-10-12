// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.Scanner;
class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next().toLowerCase();
        String str2=sc.next().toLowerCase();
        StringBuilder s=new StringBuilder(str2);
        s.reverse();
        String res=s.toString();
        if(str1.equals(res))
        {
            System.out.print("rotation");
        }else{
            System.out.println("not an rotation");
        }
    }
}