class Fraction1 {
    int numerator;
    int denominator;

    Fraction1() {
        numerator = 0;
        denominator = 1;
    }

    Fraction1(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    void display() {
        System.out.printf("%d/%d = %.2f%n", numerator, denominator, (double)numerator/denominator);
    }
}

class FractionDemo2 extends Fraction {
    FractionDemo2() {
        super();
    }

    FractionDemo2(int numerator, int denominator) {
        super(numerator, denominator);
    }

    public static void main(String[] args) {
        FractionDemo2 f1 = new FractionDemo2();
        f1.display();

        FractionDemo2 f2 = new FractionDemo2(3, 4);
        f2.display();

        FractionDemo2 f3 = new FractionDemo2(1, 2);
        f3.display();
    }
}