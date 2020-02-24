package code.java;

public class Q461 {
    // 0 <= x, y < 2^31
    public int hammingDistance(int x, int y) {
        int count = 0;
        int n = x ^ y;
        while (n > 0) {
            count += (n & 1);
            n = n >>> 1;
        }
        return count;
    }
}
