/**
 * @param {number} n
 * @return {number}
 */
//n!=a*10^b=a*(2*5)^b
//通过分解质因数能分出多少对(2*5)即末尾有多少个0
var trailingZeroes = function (n) {
    var count = 0;
    while (n >= 5) {
        n = Math.floor(n / 5);
        count += n;
    }
    return count;
};