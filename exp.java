public class exp {
    final int k=8;
    static int y=3;
    int o=8;
    public static void main(String[] args) {
      exp r=new exp();
        exp c=new exp();
      r.o=9;
        c.y=5;
      r.y=8;


        System.out.println(c.y);
        System.out.println(r.o);
        System.out.println(r.y);
        //from we understand the static variable will be allocated only once irrespective of obj creation,if somehow its value is changed then main location value is changed for that variable

    }
}
