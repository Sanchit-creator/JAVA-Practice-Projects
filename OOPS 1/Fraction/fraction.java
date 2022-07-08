package Fraction;
public class fraction {
    private int numerator;
    private int denominator;
    public fraction( int numerator, int denominator) {
        if (denominator == 0) {
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    private void simplify() {
        int gcd = 1;
        int smallerNumber = Math.min(numerator, denominator);
        for (int i = 2; i <= smallerNumber; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }
    public void print() {
        System.out.println(numerator+"/"+denominator);
    }
    
    public void increment() {
        numerator = numerator + denominator;
        simplify();
    }

    public int getNumerator(){
        return numerator;
    }

    public void setNumerator(int num) {

        this.numerator = num;
        simplify();
    }

    public void setDenominator(int num) {
        if (num == 0) {
            return;
        }
        this.denominator = num;
    }

    public int getDenominator() {
        return denominator;
    }

    // for no new fraction
    // public void add(fraction f2) {
    //     // first fraction on which function is called
    //     // second fraction is passed as arguements

    //     this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
    //     this.denominator = this.denominator * f2.denominator;
    //     simplify();

    // }

    // for thrid new fraction
    public static fraction add(fraction f1, fraction f2) {
        int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
        int newDen = f1.denominator * f2.denominator;
        fraction f3 = new fraction(newNum, newDen);
        return f3;
    }
    
}
