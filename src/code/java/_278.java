package code.java;

public class _278 {
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

    private boolean isBadVersion(int version) {
        return false;
    }
}
