
class hostiptal implements Runnable {

    String res1 = "bed";
    String res2 = "Doctor";

    public void run() {
        String Thdnm = Thread.currentThread().getName();
        if (Thdnm.equals("Tom")) {
            try {
                synchronized (res1) {
                    System.out.println("Tom use " + res1);
                    Thread.sleep(3000);

                    synchronized (res2) {
                        System.out.println("Tom use " + res2);
                        Thread.sleep(3000);
                    }
                    System.out.println("Tom release " + res2);
                    System.out.println("Tom release " + res1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                synchronized (res1) {
                    System.out.println("jerry use " + res1);
                    Thread.sleep(3000);

                    synchronized (res2) {
                        System.out.println("jerry use " + res2);
                        Thread.sleep(3000);
                    }
                    System.out.println("jerry release " + res2);
                    System.out.println("jerry release " + res1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

public class Main {

    public static void main(String[] args) {

        hostiptal hp = new hostiptal();

        Thread t1 = new Thread(hp);
        Thread t2 = new Thread(hp);

        t1.setName("Tom");
        t2.setName("jerry");

        t1.start();
        t2.start();

    }
}
