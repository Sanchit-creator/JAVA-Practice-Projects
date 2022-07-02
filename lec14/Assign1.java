public class Assign1 {
    public static int power(int x, int n) {
        if(n == 0){
            return 1;
        }
        int output = power(x, n - 1);
        int result = x * output;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
