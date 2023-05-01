public class A92 implements Runnable{
    public void run()
    {
        System.out.println("running"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        A92 t=new A92();
        Thread t1=new Thread(t);
        t1.start();
        A92 t2=new A92();
        Thread t3=new Thread(t2);
        t3.start();

    }
}
