/**
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function (s) {
    if (s.length < 1) {
        return "";
    }
    var l = 0, r = 0;
    for (var i = 0; i < s.length - 1; i++) {
        var len = Math.max(expand(s, i, i), expand(s, i, i + 1));
        if (len > r - l + 1) {
            if (len % 2) {
                l = i - (len - 1) / 2;
                r = i + (len - 1) / 2;
            } else {
                l = i - (len / 2 - 1);
                r = i + 1 + (len / 2 - 1);
            }
        }
    }
    return s.substring(l, r + 1);
};
//以l,r为对称中心向两边扩展，返回扩展后的字符串长度
var expand = function (s, l, r) {
    while (l >= 0 && r < s.length && s[l] === s[r]) {
        l--;
        r++;
    }
    return r - l - 1;
};