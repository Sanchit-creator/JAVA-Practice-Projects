public class assignment2 {
    public static int linerSerch(int arr[], int val) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
