package code.java;

public class Q005 {
    // 暴力法
    @Deprecated
    public String longestPalindrome_(String s) {
        int len = s.length();
        String res = "";
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (j - i + 1 > res.length() && check(s, i, j)) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }

    private boolean check(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    // 中心扩展法
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int l = 0, r = 0, len = s.length();
        for (int i = 0; i < len - 1; i++) {
            int max = Math.max(expand(s, i, i), expand(s, i, i + 1));
            if (max > r - l + 1) {
                if (max % 2 == 1) {
                    l = i - max / 2;
                    r = i + max / 2;
                } else {
                    l = i - (max / 2 - 1);
                    r = i + 1 + (max / 2 - 1);
                }
            }
        }
        return s.substring(l, r + 1);
    }

    // 以l,r为对称中心向两边扩展，返回扩展后的字符串长度
    private int expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;// (r-1)-(l+1)+1
    }
}
