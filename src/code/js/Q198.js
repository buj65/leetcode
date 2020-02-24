/**
 * @param {number[]} nums
 * @return {number}
 */
//设打劫到第n家时最高总金额为f(n)，则f(n)=max(f(n-2)+nums[n],f(n-1))
/*
var rob = function (nums) {
    return robHelper(nums, nums.length - 1);
};
var robHelper = function (nums, n) {
    if (n < 0) {
        return 0;
    }
    return Math.max(robHelper(nums, n - 2) + nums[n], robHelper(nums, n - 1));
};
*/
var rob = function (nums) {
    var fn_2 = 0, fn_1 = 0, fn = 0;//f(n-2), f(n-1), f(n)
    for (var i = 0; i < nums.length; i++) {
        fn = Math.max(fn_2 + nums[i], fn_1);
        fn_2 = fn_1;
        fn_1 = fn;
    }
    return fn;
};