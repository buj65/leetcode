package code.java;

public class _052 {
    private int n;
    private int[] queens;
    private int count;

    public int totalNQueens(int n) {
        this.n = n;
        this.queens = new int[n];
        this.count = 0;
        this.put(0);
        return this.count;
    }

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

    private boolean check(int x, int y) {
        for (int i = 0; i < x; i++) {
            if (y == this.queens[i] || x + y == i + this.queens[i] || x - i == y - this.queens[i]) {
                return false;
            }
        }
        return true;
    }
}
