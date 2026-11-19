
import java.util.Scanner;

class Activity implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName == "ADD") {
            Add();
        } else if (threadName == "Char") {
            Char();
        } else {
            Num();
        }

    }

    void Add() {
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

    void Char() {
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

    void Num() {
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

        Activity ac = new Activity();

        Thread t1 = new Thread(ac);
        Thread t2 = new Thread(ac);
        Thread t3 = new Thread(ac);

        t1.setName("ADD");
        t2.setName("Num");
        t3.setName("Char");

        t1.start();
        t2.start();
        t3.start();

    }
}
