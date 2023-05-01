  class parent1 {//if class final then it can not be
    public void run()
    {
        System.out.println("running");

    }
}
public class E10 extends parent1{
    public static void main(String[] args) {
        E10 ob=new E10();
        ob.run();
    }

}

