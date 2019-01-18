/**
 * @param {number[]} nums
 */
var Solution = function (nums) {
    this.nums = nums;
    this.copy = nums.slice();
};

/**
 * Resets the array to its original configuration and return it.
 * @return {number[]}
 */
Solution.prototype.reset = function () {
    return this.nums;
};

/**
 * Returns a random shuffling of the array.
 * @return {number[]}
 */
Solution.prototype.shuffle = function () {
    for (var i = this.copy.length - 1; i > 0; i--) {
        var r = Math.floor(Math.random() * (i + 1));
        var temp = this.copy[r];
        this.copy[r] = this.copy[i];
        this.copy[i] = temp;
    }
    return this.copy;
};

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = Object.create(Solution).createNew(nums)
 * var param_1 = obj.reset()
 * var param_2 = obj.shuffle()
 */