import java.util.Scanner;

public class A84 {
    public static void main(String[] args) {


            Scanner sc=new Scanner(System.in);
            int y=sc.nextInt();
            int n[]={1};
            try{
            int a = 56 / y;
                System.out.println(a);
            n[60]=9;

                System.out.println(n[60]);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
            catch(ArrayIndexOutOfBoundsException e1)
            {
                System.out.println(e1.getMessage());
            }
        System.out.println("hello");
    }
}
