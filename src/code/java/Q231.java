package code.java;

public class Q231 {
    // 2的幂二进制满足/^10*$/
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}
