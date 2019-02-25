package code.java;

public class _007 {
    public int reverse(int x) {
        int n = 0;
        while (x != 0) {
            int mod = x % 10;
            if (mod >= 0 && n > (Integer.MAX_VALUE - mod) / 10) {
                return 0;
            }
            if (mod <= 0 && n < (Integer.MIN_VALUE - mod) / 10) {
                return 0;
            }
            n = n * 10 + mod;
            x /= 10;
        }
        return n;
    }
}
