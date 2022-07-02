public class sumArray {
    public static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int smallOutput[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallOutput[i - 1] = arr[i];
        }
        int sum = sum(smallOutput);
        return arr[0] + sum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(sum(arr));
    }
}
