package code.java;

public class _172 {
    // n!=a*10^b=a*(2*5)^b
    // 通过分解质因数能分出多少对(2*5)即末尾有多少个0
    public int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
