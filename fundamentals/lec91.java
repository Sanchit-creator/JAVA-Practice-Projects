import java.util.Scanner;

public class lec91 {

    public static void printArray(int[] ARR) {
        Scanner s = new Scanner(System.in);
        int n = ARR.length;
        for (int i = 0; i < n; i++) {
            System.out.println(ARR[i]);
        }
    }

    public static int[] ele() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ARR = new int[n];
        for(int i = 0; i<n; i++) {
            System.out.print();
            ARR[i] = s.nextInt();
        }
        return ARR;
    }

    public static void main(String[] args) {
       int[] ARR = ele();
       printArray(ARR);
    }
}
