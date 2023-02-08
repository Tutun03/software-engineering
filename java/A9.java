public class A9 {
    public static void main(String[] args) {
        int a = 7, b = 5, c = 3;
        if (a >= b && a >= c) {
            System.out.println("greater is " + a);
        } else if (b >= a && b >= c) {
            System.out.println("greater is " + b);
        } else {
            System.out.println("greater is " + c);
        }
    }
}
