
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
