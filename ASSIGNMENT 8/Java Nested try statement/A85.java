import java.util.Scanner;

public class A85 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int n[] = {1};
        try {
            int a = 56 / y;
            System.out.println(a);
            try {
                n[60] = 9;

                System.out.println(n[60]);
            } catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println(e1.getMessage());
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("hello");
    }
}
