/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function (height) {
    var max = 0, l = 0, r = height.length - 1;
    while (l < r) {
        max = Math.max(max, Math.min(height[l], height[r]) * (r - l));
        //舍弃短边，因为(l,r)之间任意一条边跟短边组成的面积要小于当前面积
        //当两条边一样长时，舍弃哪条边都一样；因为如果最大面积包含当前其中一条边，另一条边不可能在(l,r)之间
        height[l] < height[r] ? l++ : r--;
    }
    return max;
};