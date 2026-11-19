
public class Main {

    public static void main(String[] args) {
        System.out.println("Main start");
        Addition ad = new Addition();
        PrintChar pc = new PrintChar();
        PrintNum pn = new PrintNum();

        ad.start();
        pn.start();
        pc.start();

        try {
            ad.join();
            pn.join();
            pc.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main ends");
    }
}
