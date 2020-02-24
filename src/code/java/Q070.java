package code.java;

public class Q070 {
    /**
     * 类似斐波那契数列
     * f(n)=n; (0<=n<=2)
     * f(n)=f(n-1)+f(n-2); (n>2)
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int f1 = 1, f2 = 2, fn = 0;
        for (int i = 3; i <= n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}
