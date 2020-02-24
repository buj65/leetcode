/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
//先上下交换，再沿左对角线交换
var rotate = function (matrix) {
    matrix.reverse();
    for (var i = 0; i < matrix.length; i++) {
        for (var j = i + 1; j < matrix.length; j++) {
            var temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
};