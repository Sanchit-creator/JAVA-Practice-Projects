public class Assign1 {
    public static void rowWiseSum(int[][] mat) {
        int rows = mat.length;
        if (rows == 0) {
            return;
        }
        int cols = mat[0].length;
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += mat[i][j];
            }
            System.out.print(sum + " ");
        }
    }
}
