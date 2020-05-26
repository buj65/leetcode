package code.java;

import java.util.Arrays;

//至少有K个重复字符的最长子串
public class Q395 {
    public int longestSubstring(String s, int k) {
        int len = s.length(), result = 0;
        if (len < k) {
            return result;
        }
        int[] arr = new int[26];
        for (int i = 0; i < len; i++) {
            Arrays.fill(arr, 0);
            for (int j = i; j < len; j++) {
                arr[s.charAt(j) - 'a']++;
                if (j - i + 1 >= k && this.check(arr, k)) {
                    result = Math.max(result, j - i + 1);
                }
            }
        }
        return result;
    }

    private boolean check(int[] arr, int k) {
        for (int n : arr) {
            if (n != 0 && n < k) {
                return false;
            }
        }
        return true;
    }
}
