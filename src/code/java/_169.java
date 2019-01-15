package code.java;

public class _169 {
    // 摩尔投票法：假设有一个候选者的票数大于总票数的一半
    // 遍历选票，每两张不一样的选票去掉，最后剩下的选票（一张或多张）即当选人
    public int majorityElement(int[] nums) {
        int major = 0, count = 0;
        for (int num : nums) {
            if (count == 0) {
                major = num;
                count++;
            } else {
                if (major == num) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return major;
    }
}
