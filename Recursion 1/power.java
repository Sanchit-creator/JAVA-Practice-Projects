public class power {

    public static int power(int n, int x) {
        if (n == 0) {
            return 1;
        }

        if (x == 0) {
            return 0;
        }
        int smalloutput = power(n - 1, x);
        int output = x * smalloutput;
        return output;
    }
    public static void main(String[] args) {
        System.out.println(power(3, 2));
    }
}
