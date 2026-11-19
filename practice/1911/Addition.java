
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
