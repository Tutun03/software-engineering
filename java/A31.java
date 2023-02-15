import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A31 {
    public static void main(String[] args) throws IOException {
        BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name");
        String x=br.readLine();
        System.out.println("my name is :" +x);
    }
}
