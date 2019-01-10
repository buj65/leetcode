package code.java;

public class _026 {
    /**
     * 双指针法
     * 找到nums[i]之后第一个和nums[i]不同的元素，放到nums[i]后面，将i指向nums[i]后面的元素
     */
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }
}
