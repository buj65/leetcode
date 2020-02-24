package code.java;

public class Q028 {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length(), len2 = needle.length();
        if (len1 < len2) {
            return -1;
        }
        if (len2 == 0) {
            return 0;
        }
        for (int i = 0; i <= len1 - len2; i++) {
            int j = 0;
            for (; j < len2; j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }
            if (j == len2) {
                return i;
            }
        }
        return -1;
    }
}
