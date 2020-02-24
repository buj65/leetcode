package code.java;

public class Q200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    expandAround(grid, i, j);
                }
            }
        }
        return count;
    }

    private void expandAround(char[][] grid, int i, int j) {
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1') {
            grid[i][j] = '2';// 表示该陆地已访问
            // 将四周陆地纳入岛屿(上右下左)
            expandAround(grid, i - 1, j);
            expandAround(grid, i, j + 1);
            expandAround(grid, i + 1, j);
            expandAround(grid, i, j - 1);
        }
    }
}
