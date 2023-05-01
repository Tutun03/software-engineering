class parent {
   public void run() {
        System.out.println("running");
    }
}
        public class E9 extends parent{

          public void run() //if parent method is final then it can not be overridden

          {
              System.out.println("going");
          }
            public static void main(String[] args) {
                E9 ob=new E9();
                ob.run();
            }

        }

