/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function (nums, k) {     //[1,2,3,4,5], 2
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);//[5,4,3,2,1]
    reverse(nums, 0, k - 1);          //[4,5,3,2,1]
    reverse(nums, k, nums.length - 1);//[4,5,1,2,3]
};
var reverse = function (nums, l, r) {
    while (l < r) {
        var temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
        l++;
        r--;
    }
};