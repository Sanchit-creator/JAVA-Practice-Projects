package Complex;

public class Complex {
    private int number;
    private int imaginary;
    public Complex(int number, int imaginary){
        this.number = number;
        this.imaginary = imaginary;
    }

    public void add(Complex c2) {
        int number = this.number + c2.number;
        int imaginary = this.imaginary + c2.imaginary;
        this.number = number;
        this.imaginary = imaginary;
    }

    public void multiple(Complex c2) {
        int number = (this.number * c2.number) - (this.imaginary * c2.imaginary);
        int imaginary = (this.number * c2.imaginary) + (this.imaginary * c2.number);
        this.number = number;
        this.imaginary = imaginary;
    }

    void print(){
        System.out.println(this.number + " + i" + this.imaginary);
    }
}
