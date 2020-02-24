/**
 * @param {number} n - a positive integer
 * @return {number}
 */
//n的二进制范围为[0x00000000, 0xffffffff]，按二进制补码记法转成十进制为[-2^31, 2^31-1]
var hammingWeight = function (n) {
    var c = 0;
    while (n !== 0) {
        c += n & 1;
        n >>>= 1;
    }
    return c;
};