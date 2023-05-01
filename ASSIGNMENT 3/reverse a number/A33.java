import java.util.Scanner;

public class A33 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        A33.reverse(x);
    }
    static void reverse(int x)
    {

        int rev=0;
        int rem;
        while(x>0){
            rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }
        System.out.println("reversed no is "+rev);

    }
}
