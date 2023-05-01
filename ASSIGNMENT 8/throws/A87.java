import java.io.IOException;
import java.util.Scanner;

public class A87 {

    static int  avx(int y)throws IOException
    {
        if(y==0)
        {
            throw new IOException();
        }
        else {
            return y;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        try{
            int l=avx(p);
            System.out.println(l);
        }
        catch(IOException e){
            System.out.println(e);
        }
        System.out.println("hello");
    }
}
