
class PrintChar extends Thread {

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
