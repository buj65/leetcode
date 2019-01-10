package code.java;

public class _069 {
    // 牛顿迭代法求平方根
    public int mySqrt(int x) {
        double r = x / 2.0, p = 0.1;// root根初始值, precision取值精度
        while (r * r - x > p || r * r - x < -p) {
            r = (r + x / r) / 2;
        }
        return (int) r;
    }
}
