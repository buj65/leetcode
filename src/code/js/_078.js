/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function (nums) {
    var lists = [[]];
    for (var i = 0; i < nums.length; i++) {
        for (var j = 0, size = lists.length; j < size; j++) {
            var list = lists[j].slice();
            list.push(nums[i]);
            lists.push(list);
        }
    }
    return lists;
};
/*
initial [ [] ]
add 1   [ [], [1] ]
add 2   [ [], [1], [2], [1,2] ]
add 3   [ [], [1], [2], [1,2], [3], [1,3], [2,3], [1,2,3] ]
 */