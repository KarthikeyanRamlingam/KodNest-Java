
import java.util.ArrayList;

public class arrlst2311 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add("karthik");
        al.add(22.5);
        al.add(true);
        al.add('K');
        System.out.println(al);
        al.addFirst(5);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.contains(80));
        System.out.println(al.contains(10));
        System.out.println(al.get(4));
        System.out.println(al.getClass());
        System.out.println(al.getFirst());
        System.out.println(al.getLast());
        System.out.println(al.isEmpty());
        System.out.println(al.add(90));
        System.out.println(al.indexOf(30));
        System.out.println(al.add(30));
        System.out.println(al.lastIndexOf(30));
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        al.set(2, "kk");
        System.out.println(al);
        al.add(3, 11);
        System.out.println(al);
        ArrayList al2 = new ArrayList();
        al2.add(777);
        al2.add(999);
        al2.add(888);
        System.out.println(al2);
        al.addAll(al2);
        System.out.println(al);

    }
}
