package code.java;

public class Q326 {
    public boolean isPowerOfThree(int n) {
        while (n > 1 && n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}
