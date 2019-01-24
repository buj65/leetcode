/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function (s, numRows) {
    if (s.length <= numRows || numRows < 2) {
        return s;
    }
    var list = [];
    for (var i = 0; i < numRows; i++) {
        list[i] = "";
    }
    var cycleLen = numRows * 2 - 2;
    for (var j = 0; j < s.length; j++) {
        var n = j % cycleLen;
        list[n < numRows ? n : cycleLen - n] += s[j];
    }
    return list.join("");
};