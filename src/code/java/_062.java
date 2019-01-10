package code.java;

public class _062 {
    /**
     * 当m=3 n=2时，需要走3步到达终点（向下1步，向右2步）
     * 将步骤进行排列：↓→→, →↓→, →→↓
     * 总的路径数即求组合数C(m+n-2,m-1)或C(m+n-2,n-1)
     * C(a,b)=a*(a-1)*(a-2)*...*(a-b+1)/b!
     */
    public int uniquePaths(int m, int n) {
        long c = 1;
        int a = m + n - 2, b = Math.min(m, n) - 1;
        for (int i = 1; i <= b; i++) {
            c = c * a / i;
            a--;
        }
        return (int) c;
    }
}
