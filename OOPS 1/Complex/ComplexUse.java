package Complex;

public class ComplexUse {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(6, 7);
        c1.add(c2);
        c1.print();
    }

}
