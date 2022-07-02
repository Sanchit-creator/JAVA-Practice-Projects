public class sortedArrays1 {
    public static boolean array(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        int smallarr[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallarr[i - 1] = arr[i];
        }
        boolean isSmallArrSorted = array(smallarr);
        return isSmallArrSorted;
    }

    // new method function

    public static boolean isSorted(int[] arr, int si) {
        if (si == arr.length - 1) {
            return true;
        }
        if (arr[si] > arr[si + 1]) {
            return false;
        }
        boolean isSmallArrSorted = isSorted(arr, si + 1);
        return isSmallArrSorted;
    }

    // public static void main(String[] args) {
    //     int[] arr = {1, 1, 3, 4, 5};
    //     System.out.println(array(arr));
    // }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 5};
        System.out.println(isSorted(arr, 0));
    }
    
}
