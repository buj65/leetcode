package code.java;

/*
思路：每行放一个皇后，检查与之前行的每个皇后是否有冲突，
无冲突则继续往下一行，有冲突则返回上一步，改变上一行的皇后的位置，
继续向下执行，直到所有皇后都放到棋盘上。

以n=4为例，执行数序如下（深度优先），
树的节点值为皇后坐标，每个节点值都不能跟其所有祖先节点值有冲突，
即满足：x1!=x2 && y1!=y2 && x1+y1!=x2+y2 && x2-x1!=y2-y1

        ________root_______
       /        / \        \
   (0,0)    (0,1) (0,2)    (0,3)    在第0行放下皇后
    / \       |     |       / \
(1,2) (1,3) (1,3) (1,0) (1,0) (1,1) 在第1行放下皇后
        |     |     |     |      
      (2,1) (2,0) (2,3) (2,2)       在第2行放下皇后
              |     |      
            (3,2) (3,1)             在第3行放下皇后

因此n=4时有两个不同的解法: [1,3,0,2], [2,0,3,1]
 * */
public class Q052 {
    // 总行数、总列数、总皇后个数
    private int n;
    // 记录皇后的坐标：下标值为行坐标，元素值为列坐标
    private int[] queens;
    // 记录结果
    private int count;

    // 主方法
    public int totalNQueens(int n) {
        this.n = n;
        this.queens = new int[n];
        this.count = 0;
        this.put(0);
        return this.count;
    }

    // 在棋盘的第x行放下皇后
    private void put(int x) {
        if (x == this.n) {
            this.count++;
            return;
        }
        for (int y = 0; y < this.n; y++) {
            if (this.check(x, y)) {
                this.queens[x] = y;
                this.put(x + 1);
            }
        }
    }

    // 检查(x,y)坐标的皇后跟行坐标小于x的皇后是否有冲突
    private boolean check(int x, int y) {
        for (int i = 0; i < x; i++) {
            if (y == this.queens[i] || x + y == i + this.queens[i] || x - i == y - this.queens[i]) {
                return false;
            }
        }
        return true;
    }
}
