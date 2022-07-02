public class fibonacciNumber {
    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = fib(n - 1);
        int b = fib(n - 2); 
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
