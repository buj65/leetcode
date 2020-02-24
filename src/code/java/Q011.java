package code.java;

public class Q011 {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int curr = Math.min(height[i], height[j]) * (j - i);
            max = Math.max(max, curr);
            // 舍弃短边 因为(i,j)之间任意一条边跟短边组成的面积要小于当前面积
            // 当两条边一样长时，舍弃哪条边都一样；因为如果最大面积包含当前其中一条边，另一条边不可能在(i,j)之间
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
