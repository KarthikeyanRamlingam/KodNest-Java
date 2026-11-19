
import java.util.Scanner;

class Addition extends Thread {

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition start");
        System.out.println("A:");
        int a = sc.nextInt();
        System.out.println("B:");
        int b = sc.nextInt();
        int res = a + b;
        System.out.println(res);
        System.out.println("Addition end");
    }
}

class Printchar extends Thread {

    @Override
    public void run() {
        System.out.println("print char start");
        for (char i = 'A'; i <= 'G'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("print char end");
    }
}

class PrintNum extends Thread {

    @Override
    public void run() {
        System.out.println("print num start");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("print num end");
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Main start");
        Addition ad = new Addition();
        Printchar pc = new Printchar();
        PrintNum pn = new PrintNum();

        ad.start();
        pn.start();
        pc.start();

        pn.interrupt();
        pc.interrupt();

    }
}
