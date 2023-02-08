class op{
    static void fun(){
        int i,fact=1,number=5;
        for(i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
public class A5 {
    public static void main(String[] args) {
        op.fun();
    }
}
