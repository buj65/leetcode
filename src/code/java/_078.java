package code.java;

import java.util.ArrayList;
import java.util.List;

public class _078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<Integer>());
        for (int num : nums) {
            for (int i = 0, size = lists.size(); i < size; i++) {
                List<Integer> list = new ArrayList<>(lists.get(i));
                list.add(num);
                lists.add(list);
            }
        }
        return lists;
    }
}
