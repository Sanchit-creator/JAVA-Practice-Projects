public class geometricSum {
    public static double geometricSum(int a) {
        if (a == 0) {
            return 1;
        }
        var smallOutput = geometricSum(a - 1);
        var formula = 1/Math.pow(2, a);
        return smallOutput + formula;
    }

    public static void main(String[] args) {
        int a = 4;
        System.out.println(geometricSum(a));
    }
}
