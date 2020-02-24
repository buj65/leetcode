/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permute = function (nums) {
    var res = [];
    permuteHelper(res, nums, 0);
    return res;
};
var permuteHelper = function (res, nums, pos) {
    if (pos === nums.length - 1) {
        res.push(nums.slice());
    } else {
        for (var i = pos; i < nums.length; i++) {
            var temp = nums[i];
            nums[i] = nums[pos];
            nums[pos] = temp;
            permuteHelper(res, nums, pos + 1);
            nums[pos] = nums[i];
            nums[i] = temp;
        }
    }
};
/*
  执行过程(深度优先)
  pos=0            _________[1,2,3]_________
                  /            |            \
  pos=1     [1,2,3]         [2,1,3]         [3,2,1]
              / \             / \             / \
  pos=2 [1,2,3] [1,3,2] [2,1,3] [2,3,1] [3,2,1] [3,1,2]
 */