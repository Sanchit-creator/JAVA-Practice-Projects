public class Assign6 {
    public static void spiralPrint(int mat[][]) {
        int rows = mat.length;
        if (rows == 0) {
            return;
        }
        int cols = mat[0].length;
        int i, rowStart = 0, colStart = 0;
        int numElements = rows * cols, count = 0;
        while (count < numElements) {
            for (i = colStart; count < numElements && i < cols; ++i) {
                System.out.print(mat[rowStart][i]+ " ");
                count++;
            }
            rowStart++;
            for (i = rowStart; count < numElements && i < rows; ++i) {
                System.out.print(mat[i][cols - 1] + " ");
                count++;
            }
            cols--;
            for (i = cols - 1; count < numElements && i >= colStart; --i) {
                System.out.print(mat[rows - 1 ][i] + " ");
                count++;
            }
            rows--;
            for (i = rows - 1; count < numElements && i >= rowStart; --i) {
                System.out.print(mat[i][colStart] + " ");
                count++;
            }
            colStart++;
        }
    }
}
