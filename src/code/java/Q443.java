package code.java;

public class Q443 {
    public int compress(char[] chars) {
        //for (char c : String.valueOf(j - i).toCharArray())
        return 0;
    }

    //[面试题 01.06](https://leetcode-cn.com/problems/compress-string-lcci/)
    String compressString(String S) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0, len = S.length();
        while (i < len) {
            while (j < len && S.charAt(i) == S.charAt(j)) {
                j++;
            }
            result.append(S.charAt(i)).append(j - i);
            i = j;
        }
        if (result.length() < len) {
            return result.toString();
        } else {
            return S;
        }
    }
}
