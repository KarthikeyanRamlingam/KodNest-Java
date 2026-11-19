class main{
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t);
        t.setName("karthik");
        System.out.println(t);
        t.setPriority(7);
        System.out.println(t);
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t);
        t.setPriority(Thread.MIN_PRIORITY);

    }
}