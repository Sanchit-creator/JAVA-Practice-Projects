public class prac4 {
    public static int firstIndexBetter(int a[], int x, int si) {
        if (si == a.length) {
            return -1;
        }
        if (a[si] == x) {
            return si;
        }
        int k = firstIndexBetter(a, x, si + 1);
        return k;
    }
}
