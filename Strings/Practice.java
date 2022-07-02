public class Practice {
    public static void reverse(int[] arr) {
        // int reverse = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        reverse(arr);
    }
}
