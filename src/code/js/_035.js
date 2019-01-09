/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
//二分查找
var searchInsert = function (nums, target) {
    var l = 0, r = nums.length - 1;
    while (l <= r) {
        var mid = Math.floor((l + r) / 2);
        if (nums[mid] === target) {
            return mid;
        }
        if (nums[mid] < target) {
            l = mid + 1;
        } else {
            r = mid - 1;
        }
    }
    return l;
};