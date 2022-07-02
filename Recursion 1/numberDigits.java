public class numberDigits {

    public static int count(int n) {
        if (n == 0) {
            return 0;
        }

        int smalloutput = count(n/10);
        return smalloutput + 1;
    }
    public static void main(String[] args) {
        System.out.println(count(21));
    }
}
