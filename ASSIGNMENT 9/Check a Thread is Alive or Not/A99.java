public class A99 extends Thread {
    public void run() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        A99 t=new A99();
        t.start();
        try{
            Thread.sleep(500);
        }
        catch (Exception E)
        {
            System.out.println(E);
        }


        System.out.println(t.isAlive());
    }
}
