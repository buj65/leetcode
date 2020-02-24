package code.java;

public class Q278 {
    public int firstBadVersion(int n) {
        int l = 0, r = n, mid = 0;
        while (l < r) {
            mid = l + (r - l) / 2;// 防止溢出
            if (isBadVersion(mid)) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    private boolean[] versions = new boolean[] { false, false, false, true, true };

    private boolean isBadVersion(int i) {
        return versions[i];
    }
}
