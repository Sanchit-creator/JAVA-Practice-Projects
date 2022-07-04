public class stairCase {
    public static int staircase(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 2;
        }
        else if (n == 3) {
            return 3;
        }
        int n_1=staircase(n-1);
        int n_2=staircase(n-2);
        int n_3=staircase(n-3);
        int result_n=n_1+n_2+n_3;
        return result_n;
    }  
    public static void main(String[] args) {
        int n = 4;
        System.out.println(staircase(n));
    } 
}
