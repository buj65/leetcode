/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function (nums) {
    for (var i = 0, j = 0; j < nums.length; j++) {
        if (nums[j] !== 0) {
            if (j !== i) {
                nums[i] = nums[j];
                nums[j] = 0;
            }
            i++;
        }
    }
};