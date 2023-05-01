class Fraction {
    int numerator;
    int denominator;

    Fraction() {
        numerator = 0;
        denominator = 1;
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void display() {
        System.out.printf("%d/%d = %.2f%n", numerator, denominator, (double)numerator/denominator);
    }
}

class FractionDemo extends Fraction {
    FractionDemo() {
        super();
    }

    FractionDemo(int numerator, int denominator) {
        super(numerator, denominator);
    }

    public static void main(String[] args) {
        Fraction f1 = new FractionDemo();
        f1.display();

        Fraction f2 = new FractionDemo(3, 4);
        f2.display();

        Fraction f3 = new FractionDemo(1, 2);
        f3.display();
    }
}
