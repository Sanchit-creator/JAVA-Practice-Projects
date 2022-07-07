public class minimumCount {
    public static int minCount(int n) {
        if (n <= 1) {
            return n;
        }
        int ans = n;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (square > n) {
                break;
            }
            ans = Math.min(ans, 1 + minCount(n - square));
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(minCount(12));
    }
}
