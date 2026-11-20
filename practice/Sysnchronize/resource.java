
class resource implements Runnable {

    synchronized public void run() {
        try {
            String Threadnm = Thread.currentThread().getName();

            System.out.println(Threadnm + " is started");
            Thread.sleep(3000);
            System.out.println(Threadnm + " is on process");
            Thread.sleep(3000);
            System.out.println(Threadnm + " is end");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
