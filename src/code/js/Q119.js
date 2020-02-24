/**
 * @param {number} rowIndex
 * @return {number[]}
 */
var getRow = function (rowIndex) {
    var row = [1];
    for (var i = 1; i <= rowIndex; i++) {
        var a = 1;//a总是等于row[j-1]
        for (var j = 1; j < row.length; j++) {
            var b = row[j];
            b = a + b;
            a = b - a;
            row[j] = b;
        }
        row.push(1);
    }
    return row;
};