import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long binary = 0, pow = 1;
        while (n > 0) {
            int last = n % 2;
            binary += last * pow;
            pow *= 10;
            n = n/2;
        }
        System.out.println(binary);
    }
}
