public class A93 extends Thread {
    @Override
    public void run() {

        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        A93 t =new A93();
        t.start();
        Thread.yield();
        for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
