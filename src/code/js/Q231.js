/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfTwo = function (n) {
    // return /^10*$/.test(n.toString(2));
    return n > 0 && (n & (n - 1)) === 0;
};