package code.java;

import java.util.Arrays;
import java.util.Random;

public class _384 {
    private int[] nums;
    private int[] copy;
    private Random rand;

    public _384(int[] nums) {
        this.nums = nums;
        copy = Arrays.copyOf(nums, nums.length);
        rand = new Random();
    }

    public int[] reset() {
        return nums;
    }

    public int[] shuffle() {
        for (int i = copy.length - 1; i > 0; i--) {
            int r = rand.nextInt(i + 1);
            int temp = copy[r];
            copy[r] = copy[i];
            copy[i] = temp;
        }
        return copy;
    }
}
