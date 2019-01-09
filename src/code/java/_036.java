package code.java;

public class _036 {
    public boolean isValidSudoku(char[][] board) {
        int len = 9;
        boolean[][] rows = new boolean[len][len];// 行
        boolean[][] columns = new boolean[len][len];// 列
        boolean[][] girds = new boolean[len][len];// 宫格
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int n = board[i][j] - '0' - 1;
                if (rows[i][n] || columns[j][n] || girds[i / 3 * 3 + j / 3][n]) {
                    return false;
                }
                rows[i][n] = true;
                columns[j][n] = true;
                girds[i / 3 * 3 + j / 3][n] = true;
            }
        }
        return true;
    }
}
