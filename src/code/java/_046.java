package code.java;

import java.util.ArrayList;
import java.util.List;

public class _046 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(result, nums, 0);
        return result;
    }

    private void permute(List<List<Integer>> result, int[] nums, int n) {
        if (n == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            result.add(list);
            return;
        }
        for (int i = n; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[n];
            nums[n] = temp;
            permute(result, nums, n + 1);
            nums[n] = nums[i];
            nums[i] = temp;
        }
    }
}
