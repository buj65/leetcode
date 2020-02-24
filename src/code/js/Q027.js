/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
//双指针法
var removeElement = function (nums, val) {
    var i = 0;
    for (var j = 0; j < nums.length; j++) {
        if (nums[j] !== val) {
            nums[i++] = nums[j];
        }
    }
    return i;
};