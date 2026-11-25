
import java.util.*;

public class Linklst {

    public static void main(String[] args) {

        List<Integer> LL = new LinkedList<>();

        LL.add(10);
        LL.add(20);
        LL.add(30);
        LL.add(40);
        LL.add(50);
        System.out.println(LL);

        LL.remove(0);
        System.out.println(LL);

        LL.remove(Integer.valueOf(40));
        System.out.println(LL);
    }
}
