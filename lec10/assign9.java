public class assign9 {
    public static int arrayRotateCheck(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                return(i+1);
            }
            
        }
        return 0;
    }
}
