package code.java;

public class Q198 {
    // 设打劫到第n家时最高总金额为f(n)，则f(n)=max(f(n-2)+nums[n],f(n-1))
    public int rob(int[] nums) {
        int prev2 = 0, prev1 = 0, curr = 0;// f(n-2), f(n-1), f(n)
        for (int num : nums) {
            curr = Math.max(prev2 + num, prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
}
