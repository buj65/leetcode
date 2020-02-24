/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfThree = function (n) {
    // while (n > 1 && n % 3 === 0) {
    //     n /= 3;
    // }
    // return n === 1;
    return /^10*$/.test(n.toString(3));
};