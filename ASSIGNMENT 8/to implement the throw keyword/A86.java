import java.util.Scanner;

public class A86 {
    public static void main(String[] args)  {

        Scanner sc =new Scanner(System.in);
        int y=sc.nextInt();
        if(y==0) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
        System.out.println("hello");
    }
}
