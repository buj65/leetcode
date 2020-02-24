package code.java;

public class Q268 {
    /*
    public int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
    */
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            // 边加边减 防止溢出
            n += (i - nums[i]);
        }
        return n;
    }
}
