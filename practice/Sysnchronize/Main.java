
public class Main {

    public static void main(String[] args) {
        resource rs = new resource();
        Thread t1 = new Thread(rs);
        Thread t2 = new Thread(rs);
        Thread t3 = new Thread(rs);

        t1.setName("boy");
        t2.setName("girl");
        t3.setName("other");

        t1.start();
        t2.start();
        t3.start();
    }
}
