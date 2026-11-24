
import java.util.*;

public class arrlst2 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            names.add(sc.next());
        }
        System.out.println(names);
        names.add(1, "priya");
        System.out.println(names);
        names.set(3, "ramu");
        System.out.println(names);
        names.remove(0);
        System.out.println(names);

    }
}
