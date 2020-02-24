package code.java;

public class Q058 {
    public int lengthOfLastWord(String s) {
        int ans = 0, i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            ans++;
            i--;
        }
        return ans;
        // s = s.trim();
        // return s.length() - s.lastIndexOf(' ') - 1;
    }
}
