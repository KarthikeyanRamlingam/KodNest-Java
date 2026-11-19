
class Printchar implements Runnable {

    @Override
    public void run() {
        System.out.println("print char start");
        for (char i = 'A'; i <= 'G'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.getLogger(Printnum.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        }
        System.out.println("print char end");
    }
}
