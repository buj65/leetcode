/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function (height) {
    var max = 0, l = 0, r = height.length - 1;
    while (l < r) {
        max = Math.max(max, Math.min(height[l], height[r]) * (r - l));
        //舍弃短边 因为(l,r)之间任意一条边跟短边组成的面积要小于当前面积
        height[l] < height[r] ? l++ : r--;
    }
    return max;
};