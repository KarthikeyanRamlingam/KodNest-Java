
import java.util.ArrayList;
import java.util.Scanner;

public class arrlst2411 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ar.add(sc.nextInt());
        }
        System.out.println(ar);

        for (Object x : ar) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print(ar.getFirst());
    }
}
