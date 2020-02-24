package code.java;

public class Q074 {
    /*
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int i = matrix.length - 1, j = matrix[0].length - 1;

        // 第一次二分查找：找到目标所在的行
        int l = 0, r = i;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (matrix[mid][j] == target) {
                return true;
            }
            if (matrix[mid][j] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        int targetRow = l;
        if (targetRow > i) {
            return false;
        }

        // 第二次二分查找：在目标所在的行查找
        l = 0;
        r = j;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (matrix[targetRow][mid] == target) {
                return true;
            }
            if (matrix[targetRow][mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
    */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            }
            if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
