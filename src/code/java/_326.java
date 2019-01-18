package code.java;

public class _326 {
    public boolean isPowerOfThree(int n) {
        while (n > 1 && n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}
