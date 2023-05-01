

class Booktheater{

    static int total_seats=10;
     void Book(int seats)
    {
        System.out.println(Thread.currentThread().getName()+"hi");
        System.out.println(Thread.currentThread().getName()+"hi");
        System.out.println(Thread.currentThread().getName()+"hi");
        System.out.println(Thread.currentThread().getName()+"hi");
        synchronized (this){// we can we synchronize method also
            if(total_seats>=seats)
            {
                System.out.println("successful booking");
                total_seats=total_seats-seats;
                System.out.println( "seats left"+ total_seats);
            }
            else{
                System.out.println("oops@! sorry no seats are available currently");

                System.out.println("seats left-"+total_seats);
            }


            System.out.println(Thread.currentThread().getName()+"hi");
            System.out.println(Thread.currentThread().getName()+"hi");
            System.out.println(Thread.currentThread().getName()+"hi");
            System.out.println(Thread.currentThread().getName()+"hi");
            System.out.println(Thread.currentThread().getName()+"hi");
        }


    }
}
public class E2 extends Thread{
    int seats;
      static Booktheater b;
    @Override
    public void run() {
        b.Book(seats);
    }

    public static void main(String[] args) {
        b=new Booktheater();
        E2 rohit =new E2();
        rohit.start();
        rohit.seats=7;
        E2 RAKESH=new E2();
        RAKESH.start();
        RAKESH.seats=3;

    }
}
