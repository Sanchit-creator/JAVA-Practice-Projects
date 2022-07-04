public class sumOfDigit {
    public static int sum(int n) {
        if (n%10 == n) {
            return n;
        }
        int smallOutput = sum(n/10);
        return n%10 + smallOutput;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));
    }
}
