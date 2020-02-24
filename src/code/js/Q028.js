/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function (haystack, needle) {
    var l1 = haystack.length, l2 = needle.length;
    var threshold = l1 - l2;
    if (l1 < l2) {
        return -1;
    }
    if (l2 === 0) {
        return 0;
    }
    for (var i = 0; i <= threshold; i++) {
        for (var j = 0; j < l2; j++) {
            if (haystack[i + j] !== needle[j]) {
                break;
            }
        }
        if (j === l2) {
            return i;
        }
    }
    return -1;
};
//怎么用KMP算法实现？