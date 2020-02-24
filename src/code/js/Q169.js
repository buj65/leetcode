/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function (nums) {
    //摩尔投票法：假设有一个候选者的票数大于总票数的一半
    //遍历选票，每两张不一样的选票去掉，最后剩下的选票（一张或多张）即当选人
    var major = nums[0], count = 1;
    for (var i = 1; i < nums.length; i++) {
        if (count === 0) {
            major = nums[i];
            count++;
        } else {
            major === nums[i] ? count++ : count--;
        }
    }
    return major;
};