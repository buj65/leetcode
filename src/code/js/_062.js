/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
/*
  方法1
  给格子标上坐标（以m=3 n=2为例）
    |(0,0)|(0,1)|(0,2)|
    |(1,0)|(1,1)|(1,2)|
  用二叉树进行穷举
        _____(0,0)_____
       /               \
    (1,0)             _(0,1)_
     / \             /       \
    x  (1,1)     (1,1)       (0,2)
        / \       / \         / \
       x  (1,2)  x  (1,2) (1,2)  x
  结论：当m=3 n=2时，从(0,0)到(1,2)共有3条路径

  算法时间复杂度分析
    二叉树深度=(m-1)+(n-1)=(m+n-2); (m>0,n>0)
    在深度固定的情况下，树的节点数跟m,n的取值相关
    当m=1或n=1时节点数最少，当m=n时节点数最多
    (m+n-2) < 节点数 < 2^(m+n-2)-1
    因此算法时间复杂度最好的情况为Ω(m+n)，最差为O(2^(m+n))
 */
/*
var uniquePaths = function (m, n) {
    return uniquePathsHelper(0, 0, m - 1, n - 1);
};
var uniquePathsHelper = function (x, y, max_x, max_y) {
    if (x === max_x && y === max_y) {
        return 1;
    }
    if (x > max_x || y > max_y) {
        return 0;
    }
    return uniquePathsHelper(x + 1, y, max_x, max_y) + uniquePathsHelper(x, y + 1, max_x, max_y);
};
*/

/*
  方法2
  当m=3 n=2时，需要走3步到达终点（向下1步，向右2步）
  将步骤进行排列：↓→→, →↓→, →→↓
  总的路径数即求组合数C(m+n-2,m-1)或C(m+n-2,n-1)
  C(a,b)=a*(a-1)*(a-2)*...*(a-b+1)/b!
  算法时间复杂度：O(min(m,n))
 */
var uniquePaths = function (m, n) {
    var c = 1;
    var a = m + n - 2, b = Math.min(m, n) - 1;
    for (var i = 1; i <= b; i++) {
        c = c * a / i;//不能写成c*=a/i，a/i不一定能整除
        a--;
    }
    return c;
};