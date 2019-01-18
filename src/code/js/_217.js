/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
    var set = {};
    for (var i = 0; i < nums.length; i++) {
        if (set[nums[i]]) {
            return true;
        }
        set[nums[i]] = true;
    }
    return false;
};