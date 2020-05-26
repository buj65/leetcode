package code.java;

import java.util.Set;
import java.util.HashSet;

public class Q003 {
    /**
     * 方法1：暴力法
     * 遍历，找出以当前字符开头的最长无重复字符串，更新max
     * 时间复杂度：O(n^2)
     */
    @Deprecated
    public int lengthOfLongestSubstring_(String s) {
        int max = 0, len = s.length();
        for (int i = 0; i < len; i++) {
            Set<Character> set = new HashSet<Character>();
            for (int j = i; j < len; j++) {
                if (!set.add(s.charAt(j))) {
                    break;
                }
            }
            max = Math.max(max, set.size());
        }
        return max;
    }

    /**
     * 方法2：滑动窗口
     * 将set看作一个可以在字符串上滑动的窗口，窗口边界为[i,j)，窗口大小为j-i
     * j向右逐步滑动，滑动失败(遇到重复字符)则舍弃左边字符(i向右滑动)，滑动成功则更新max
     * 时间复杂度：O(n)
     */
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
