

public class A94 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);

            } catch (Exception E) {
                System.out.println(E);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        A94 t=new A94();
        t.start();
    }
}
