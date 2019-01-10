/**
 * @param {number[]} nums
 * @return {number}
 */
//方法1：假设最大子序以nums[i]开头
/*
var maxSubArray = function (nums) {
    var max = nums[0];
    for (var i = 0; i < nums.length; i++) {
        var sum = 0;
        for (var j = i; j < nums.length; j++) {
            sum += nums[j];
            max = Math.max(max, sum);
        }
    }
    return max;
};
*/

//方法2：假设最大子序以nums[i]结尾
var maxSubArray = function (nums) {
    var currMax = nums[0];//记录以nums[i]结尾的最大子序和，初始化为以nums[0]结尾的最大子序和
    var max = currMax;//记录currMax的最大值
    for (var i = 1; i < nums.length; i++) {
        currMax = Math.max(currMax + nums[i], nums[i]);
        max = Math.max(max, currMax);
    }
    return max;
};