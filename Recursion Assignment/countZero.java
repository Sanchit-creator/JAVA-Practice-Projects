public class countZero {
    public static int returnZero(int n) {
        
        if (n == 0) {
            return 1;
        }
        if(n>0 && n<10){
            return 0;
        }
        int smallOutput = returnZero(n/10);
        if (n%10 == 0) {
            smallOutput = smallOutput + 1;

        }
        return smallOutput;
    }

    public static void main(String[] args) {
        int n = 0120405;
        System.out.println(returnZero(n));
    }
}
