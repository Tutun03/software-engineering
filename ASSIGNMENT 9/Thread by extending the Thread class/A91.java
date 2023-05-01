public class A91  extends Thread{
    @Override
    public void run() {
        System.out.println("running-"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        A91 sc=new A91();
        sc.start();
        A91 sc1=new A91();
        sc1.start();
    }
}
