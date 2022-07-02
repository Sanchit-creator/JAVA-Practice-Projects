public class checkNumber {
    public static boolean isPresent(int[] arr, int x) {
        if (arr.length == 0) {
            return false;
        }
        if (arr[0] == x) {
            return true;
        }
        int smallOutput[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallOutput[i - 1] = arr[i];
        } 
        boolean isPresent = isPresent(smallOutput, x);
        return isPresent;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(isPresent(arr, 5));
    }
}
