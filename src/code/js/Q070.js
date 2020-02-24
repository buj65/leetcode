/**
 * 当n=1，f(1)=1
 * 当n=2，f(2)=2
 * 当n=3，f(3)=3
 * 当n=4，f(4)=5
 * 当n=5，f(5)=8
 * ...
 * 类似斐波那契数列
 * f(n)=n; (0<=n<=2)
 * f(n)=f(n-1)+f(n-2); (n>2)
 * @param {number} n
 * @return {number}
 */
var climbStairs = function (n) {
    if (n <= 2) {
        return n;
    }
    var f1 = 1, f2 = 2, fn = 0;
    for (var i = 3; i <= n; i++) {
        fn = f1 + f2;
        f1 = f2;
        f2 = fn;
    }
    return fn;
};