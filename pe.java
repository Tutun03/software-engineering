import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class bp{
    abstract void fop();

}

//if any class extends the abstract class then it should override the abstract method.

interface w{
    public abstract void uop();
}

interface d {

    static int a=8;
    public abstract void popo();

}


class Yo implements d,w {
    public void jeje()
    {
        System.out.println("jeje");
    }

    @Override
    public void popo() {
        System.out.println("hopo");
    }

    @Override
    public void uop() {
        System.out.println("hi babes");
    }
}
class hello extends Yo implements d
{
    hello()
    {
        System.out.println("good night");
    }
    hello(int go)
    {

    }

    public void going()
    {

        System.out.println("gpopo");
    }
}

class MyException1 extends Throwable{
    String str2;
    MyException1(String str1)
    {
        str2=str1;
    }

    @Override
    public  String toString() {
        return("MyException"+ str2);
    }
}
public class pe extends hello  implements d
{

    int a;
    pe(int a) throws IOException {
        //super(7);
        //super();
        this();


        this.a=a;

    }
    pe() throws IOException {
        super();
        //this(7);
        System.out.println("default");
        int y=7;
        int o=8;
        BufferedReader PO=new BufferedReader( new InputStreamReader (System.in));
        int u= Integer.parseInt(PO.readLine());
        if( o==8)
        {
            try {
                throw new MyException1("error");
            }
            catch( MyException1 e)
            {
                System.out.println(e);
            }
        }



    }
    public  void fofo(int y)
    {
        System.out.println(y);
        super.going();
        System.out.println("fopo");
    }

    public void going()
    {
        this.fofo(9);
        System.out.println(this);
        System.out.println("gpopo");
    }
    public static void main(String[] args) throws IOException {
        pe a=new pe();
        a.fofo(8);
        a.going();
        System.out.println(a);
        a.jeje();
        Yo b =new pe();
        b.jeje();
        StringBuilder e =new StringBuilder("hello");
        e.append("polishpohffffopoio");
        System.out.println(e.capacity());
        int [][]h=new int[5][];
        h[0]= new int[]{1, 2, 3};
        h[1]=new int[]{2,3};
        h[2]=new int[]{2};
        h[3]=new int[]{9,8,7,6,5};
        for(int i=0;i<=h.length;i++)
        {
            for(int j=0;j<=h[i].length;j++)
            {
                System.out.println(h[i][j]);
            }
        }
    }

}
//constructor overriding is not possible in java