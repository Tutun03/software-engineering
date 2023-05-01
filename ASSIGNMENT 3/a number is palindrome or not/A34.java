import java.sql.SQLOutput;
import java.util.Scanner;

public class A34 {



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        reverse(x);
    }
    static int reverse(int x)
    {
      int l=x;
        int rev=0;
        int rem;
        while(x>0){
            rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;
        }
        if(l==rev)
            System.out.println(l+ " is a palindrome no");
        else
            System.out.println(l+ " is not a palindrome no");
        return rev;
    }
}
