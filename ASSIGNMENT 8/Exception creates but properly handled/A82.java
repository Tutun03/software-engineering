import java.util.Scanner;

public class A82 {
    public static void main(String[] args) {
        Scanner sx=new Scanner(System.in);
        int i=sx.nextInt();
        try{
            int y=67/i;
            System.out.println(y);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("good morning");

    }
}
