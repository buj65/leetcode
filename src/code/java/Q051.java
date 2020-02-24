package code.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q051 {
    // 总行数，总列数，总皇后个数
    private int n;
    // 记录皇后的坐标：下标值为行坐标，元素值为列坐标
    private int[] queens;
    // 记录结果
    private List<List<String>> result;

    // 主方法
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        queens = new int[n];
        result = new ArrayList<List<String>>();
        putQueen(0);
        return result;
    }

    // 在棋盘的第x行放下皇后
    private void putQueen(int x) {
        if (x == n) {
            addLog();
            return;
        }
        for (int y = 0; y < n; y++) {
            if (check(x, y)) {
                queens[x] = y;
                putQueen(x + 1);
            }
        }
    }

    // 检查(x,y)坐标的皇后跟行坐标小于x的皇后是否有冲突
    private boolean check(int x, int y) {
        for (int i = 0; i < x; i++) {
            if (queens[i] == y || i + queens[i] == x + y || x - i == y - queens[i]) {
                return false;
            }
        }
        return true;
    }

    // 把当前queens的坐标值记录到result
    private void addLog() {
        List<String> list = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
            board[i][queens[i]] = 'Q';
            list.add(new String(board[i]));
        }
        result.add(list);
    }
}
