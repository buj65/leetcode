package java;

import java.util.HashMap;
import java.util.Map;

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
        return null;
    }
}