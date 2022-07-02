package prac2;

public class fraction {
    private int numerator;
    private int denomiantor;
    public fraction(int numerator, int denomiantor){
        this.numerator = numerator;
        this.denomiantor = denomiantor;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denomiantor);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denomiantor % i == 0) {
                gcd = i;
            }

        }
        numerator = numerator / gcd;
        denomiantor = denomiantor / gcd;
    }

    public void print() {
        System.out.println(numerator + "/" + denomiantor);
    }
}
