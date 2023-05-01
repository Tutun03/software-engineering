public class CounterThread extends Thread {
    private int count;

    public CounterThread(int priority) {
        setPriority(priority);
    }

    public int getCount() {
        return count;
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                count++;
                sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread priority " + getPriority() + " count: " + count);
    }

    public static void main(String[] args) {
        CounterThread t1 = new CounterThread(1);
        CounterThread t2 = new CounterThread(3);
        CounterThread t3 = new CounterThread(5);
        CounterThread t4 = new CounterThread(7);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final counts:");
        System.out.println("Thread priority 1 count: " + t1.getCount());
        System.out.println("Thread priority 3 count: " + t2.getCount());
        System.out.println("Thread priority 5 count: " + t3.getCount());
        System.out.println("Thread priority 7 count: " + t4.getCount());
    }
}

