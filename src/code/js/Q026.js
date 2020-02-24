/**
 * @param {number[]} nums
 * @return {number}
 */
//双指针法
var removeDuplicates = function (nums) {
    for (var i = 0, j = 1; j < nums.length; j++) {
        //找到nums[i]之后第一个和nums[i]不同的元素，放到nums[i]后面，将i指向nums[i]后面的元素
        if (nums[i] !== nums[j]) {
            nums[++i] = nums[j];
        }
    }
    return i + 1;
};