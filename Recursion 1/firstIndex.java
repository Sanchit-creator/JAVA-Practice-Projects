public class firstIndex {
    public static int searchNumber(int[] arr, int x, int si) {
        if (si == arr.length) {
            return -1;
        }
        if (arr[si] == x) {
            return si;
        }
        return searchNumber(arr, x, si + 1);
    }
    public static int searchNumber(int[] arr, int x) {
        return searchNumber(arr, x, 0);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 5};
        System.out.println(searchNumber(arr, 5));
    }
}
