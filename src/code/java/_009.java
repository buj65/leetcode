package code.java;

public class _009 {
    public boolean isPalindrome(int x) {
        // 特殊情况
        if (x < 0 || (x % 10 == 0 && x > 0)) {
            return false;
        }
        // 不能将整个数字反转，有可能溢出；反转后半数字
        int n = 0;
        while (x > n) {
            n = n * 10 + x % 10;
            x /= 10;
        }
        // 当原数字个数为偶数时x==n，个数为奇数时n需舍掉最后一位
        return x == n || x == n / 10;
    }
}
