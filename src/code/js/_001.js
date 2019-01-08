/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
    var map = {};
    for (var i = 0; i < nums.length; i++) {
        var n = target - nums[i];
        if (map[n] !== undefined) {
            return [map[n], i];
        }
        map[nums[i]] = i;
    }
};