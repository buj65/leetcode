package code.java;

public class Q204 {
    // 埃拉托斯特尼筛法(sieve of Eratosthenes)
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        int count = 1;
        boolean[] noPrime = new boolean[n];
        for (int i = 3; i < n; i += 2) {
            if (!noPrime[i]) {
                count++;
                for (int j = 3; j * i < n; j += 2) {
                    noPrime[j * i] = true;
                }
            }
        }
        return count;
    }
}
