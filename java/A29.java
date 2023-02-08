public class A29 {
    int func(float x,float y)
    {
        return (int) ((float)x*y);
    }

    public static void main(String[] args) {
        A29 obj=new A29();
        System.out.println(obj.func(3.3f,8.6f));
    }
}
