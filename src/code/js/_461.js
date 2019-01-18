/**
 * @param {number} x
 * @param {number} y
 * @return {number}
 */
var hammingDistance = function (x, y) {
    var count = 0, n = x ^ y;
    while (n > 0) {
        count += (n & 1);
        n = n >> 1;
    }
    return count;
};