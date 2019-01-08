package code.java;

public class _008 {
    public int myAtoi(String str) {
        long ans = 0;
        int i = 0, sign = 1, len = str.length();
        // 去掉头部空格
        while (i < len && str.charAt(i) == ' ') {
            i++;
        }
        // 判断正负
        if (i < len && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            sign = str.charAt(i) == '+' ? 1 : -1;
            i++;
        }
        // 开始转换
        for (; i < len; i++) {
            int n = str.charAt(i) - '0';
            if (n < 0 || n > 9) {
                break;
            }
            ans = ans * 10 + sign * n;
            if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
                return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        return (int) ans;
    }
}
