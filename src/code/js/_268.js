/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function (nums) {
    var sum = nums.length * (nums.length + 1) / 2;
    for (var i = 0; i < nums.length; i++) {
        sum -= nums[i];
    }
    return sum;
};