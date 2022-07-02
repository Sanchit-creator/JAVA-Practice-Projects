public class Assign2 {
    public static void findLargest(int mat[][]) {
        boolean isRow = true;
        int largestSum = Integer.MIN_VALUE;
        int num = 0;
        int rows = mat.length;
        if (rows == 0) {
            System.out.println("row" + num + " " + largestSum);
            return;
        }
        int cols = mat[0].length;
        for (int i = 0; i < rows; i++) {
            int rowsum = 0;
            for (int j = 0; j < cols; j++) {
                rowsum += mat[i][j];
            }
            if (rowsum > largestSum) {
                largestSum = rowsum;
                num = i;
            }
           
        }
        for (int j = 0; j < cols; j++) {
            int colsum = 0;
            for (int i = 0; i < rows; i++) {
               colsum += mat[i][j];
            }
            if (colsum > largestSum) {
                largestSum = colsum;
                num = j;
                isRow = false;
            }
        }
        if (isRow) {
            System.out.println("row " + num + " " + largestSum);
        } else {
            System.out.println("column " + num + " " + largestSum);
        }
    
    }
}

