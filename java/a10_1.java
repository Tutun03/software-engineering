public class a10_1 {
    static int n=2020;
    public static void main(String[] args) {
        if ((n % 4 == 0 && n % 100 != 0) && (n % 400 == 0))
            System.out.println("leap year");
        else
            System.out.println("not a leap year");
    }
    }

