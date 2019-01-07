package java;

import java.util.Set;
import java.util.HashSet;

public class _003 {
    // 方法1：暴力法
    // 遍历，找出以当前字符开头的最长无重复字符串，更新max
    // 时间复杂度：O(n^2)
    /*
    public int lengthOfLongestSubstring(String s) {
        int max = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            Set<Character> set = new HashSet<Character>();
            for (int j = i; j < len; j++) {
                if (set.add(s.charAt(j)) == false) {
                    break;
                }
            }
            max = Math.max(max, set.size());
        }
        return max;
    }
    */

    // 方法2：滑动窗口
    // set储存[i,j]内字符，集合往右边扩展，扩展失败则舍弃左边字符直到扩展成功，扩展成功更新max
    // 时间复杂度：O(n)
    public int lengthOfLongestSubstring(String s) {
        int max = 0, i = 0, j = 0, len = s.length();
        Set<Character> set = new HashSet<Character>();
        while (j < len) {
            if (set.add(s.charAt(j))) {
                j++;
                max = Math.max(max, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
