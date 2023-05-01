 class y {
    static  void add (int a,int b)
    {
        System.out.println("go");
        System.out.println(a+b);
    }

}
class x extends y{
     static void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
public class A59{
    public static void main(String[] args) {
        y ob=new x();
        ob.add(7,8);
    }
}
