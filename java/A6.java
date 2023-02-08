import java.util.Scanner;
class opp{
    void fun(){
        int i,fact=1;
        Scanner op0=new Scanner(System.in);
        int cp=op0.nextInt();
        for(i=1;i<=cp;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
public class A6 {
    public static void main(String[] args) {
        opp op1=new opp();
        op1.fun();
    }
}

