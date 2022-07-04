public class Multiplication {
    public static int multiplication(int m, int n) {
        if (n == 0 || m == 0) {
            return 0;
        }
        int smallOutput = multiplication(m - 1, n);
        
        return n + smallOutput;
    }
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        System.out.println(multiplication(m, n));
    }
}
