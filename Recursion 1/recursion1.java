public class recursion1 {
    public static int sumn(int n) {
        if (n == 0) {
            return 0;
        }

        int smalloutput = sumn(n - 1);
        int output = n + smalloutput;
        return output;
    }

    public static void main(String[] args) {
        System.out.println(sumn(5));
    }
}
