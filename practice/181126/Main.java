
public class Main {

    public static void main(String[] args) {
        Addition ad = new Addition();
        Printchar pc = new Printchar();
        Printnum pn = new Printnum();

        Thread t1 = new Thread(ad);
        Thread t2 = new Thread(pc);
        Thread t3 = new Thread(pn);

        t1.start();
        t2.start();
        t3.start();

    }
}
