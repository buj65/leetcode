package code.java;

public class _292 {
    // 当堆中剩下4块石头，先手的人将输
    // 保证自己每次拿后堆中剩下的石头数是4的倍数就能赢
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
