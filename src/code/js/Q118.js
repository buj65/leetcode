/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function (numRows) {
    var triangle = [];
    if (numRows < 1) {
        return triangle;
    }
    triangle.push([1]);
    for (var i = 1; i < numRows; i++) {
        var row = [1];
        var preRow = triangle[i - 1];
        for (var j = 1; j < i; j++) {
            row.push(preRow[j - 1] + preRow[j]);
        }
        row.push(1);
        triangle.push(row);
    }
    return triangle;
};