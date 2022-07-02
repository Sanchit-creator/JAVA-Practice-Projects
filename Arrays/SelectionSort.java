public class SelectionSort {

    // public static void printArray(int[] arr) {
        
    // }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int mini = arr[i];
            int minIndex = i;

            for (int j = i; j < arr.length; j++) {
                if (mini > arr[j]) {
                    mini = arr[j];
                    minIndex = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        
        }
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 7, 2, 6};
        selectionSort(arr);
        // printArray(arr);
    }
}
