/**
 * @param {character[][]} grid
 * @return {number}
 */
var numIslands = function (grid) {
    if (grid.length === 0 || grid[0].length === 0) {
        return 0;
    }
    var count = 0;
    for (var i = 0; i < grid.length; i++) {
        for (var j = 0; j < grid[0].length; j++) {
            if (grid[i][j] === '1') {
                count++;
                expandAround(grid, i, j);
            }
        }
    }
    return count;
};
var expandAround = function (grid, i, j) {
    if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] === '1') {
        grid[i][j] = '2';
        expandAround(grid, i - 1, j);
        expandAround(grid, i, j + 1);
        expandAround(grid, i + 1, j);
        expandAround(grid, i, j - 1);
    }
};