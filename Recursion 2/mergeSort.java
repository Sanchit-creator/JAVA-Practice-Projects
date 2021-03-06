public class mergeSort {

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int a[] = new int[arr.length/2];
        int b[] = new int[arr.length - a.length];
        for(int i=0;i<arr.length/2;i++){
            a[i]=arr[i];
        }
        for(int i=arr.length/2;i<arr.length;i++){
            b[i-arr.length/2]=arr[i];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }

    public static void merge(int s1[], int s2[], int d[]) {
        int i = 0; int j = 0; int k = 0;
        while (i < s1.length && j < s2.length) {
            if (s1[i] >= s2[j]) {
                d[k] = s2[j];
                k++;
                j++;
            }else{
                d[k] = s1[i];
                k++;
                i++;
            }
        }
        while (i < s1.length) {
            d[k] = s1[i];
            k++;
            i++;
        }
        while (j < s2.length) {
            d[k] = s2[j];
            k++;
            j++;
        }
    }

    

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 7, 3, 8, 6, 9, 4};
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
