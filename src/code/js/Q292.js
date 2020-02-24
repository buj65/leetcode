/**
 * @param {number} n
 * @return {boolean}
 */
var canWinNim = function (n) {
    //当堆中剩下4块石头，先手的人将输
    //保证自己每次拿后堆中剩下的石头数是4的倍数就能赢
    return n % 4 !== 0;
};