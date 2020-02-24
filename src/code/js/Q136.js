/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
    //原理: a^0=a, a^a=0, a^b^a=a^a^b=b
    var n = 0;
    for (var i = 0; i < nums.length; i++) {
        n ^= nums[i];
    }
    return n;
};