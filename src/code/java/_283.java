package code.java;

public class _283 {
    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                if (j != i) {
                    // int temp = nums[i];
                    // nums[i] = nums[j];
                    // nums[j] = temp;
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
                i++;
            }
        }
    }
}
