package code.java;

public class Q008 {
    public int myAtoi(String str) {
        int res = 0;
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
            if (sign > 0 && res > (Integer.MAX_VALUE - sign * n) / 10) {
                return Integer.MAX_VALUE;
            }
            if (sign < 0 && res < (Integer.MIN_VALUE - sign * n) / 10) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + sign * n;
        }
        return res;
    }
}
