public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int i = 1;
        int temp;
        while (i < arr.length) {
            temp = arr[i];
            int j = i - 1;
            while (j >= 0) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
                j -= 1;
            }
            arr[j + 1] = temp;
            i += 1;
        }
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 9, 7, 2, 1};
        insertionSort(arr);
    }
}
