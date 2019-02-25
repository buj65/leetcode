package code.java;

import java.util.Map;
import java.util.HashMap;

public class _001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if (map.containsKey(n)) {
                return new int[] { map.get(n), i };
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException("No solution");
    }
}
