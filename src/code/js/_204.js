/**
 * @param {number} n
 * @return {number}
 */
//埃拉托斯特尼筛法(sieve of Eratosthenes)
var countPrimes = function (n) {
    if (n < 3) {
        return 0;
    }
    var count = 1;
    var noPrime = new Array(n);//noPrime[i]为true表示i不为质数
    for (var i = 3; i < n; i += 2) {
        if (!noPrime[i]) {
            count++;
            for (var j = 3; j * i < n; j += 2) {
                noPrime[j * i] = true;
            }
        }
    }
    return count;
};