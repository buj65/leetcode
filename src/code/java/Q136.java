package code.java;

public class Q136 {
    // 原理: a^0=a, a^a=0, a^b^a=a^a^b=b
    public int singleNumber(int[] nums) {
        int n = 0;
        for (int num : nums) {
            n ^= num;
        }
        return n;
    }
}
