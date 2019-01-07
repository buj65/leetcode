/**
 * @param {string} s
 * @return {number}
 */
//将set看作一个可以在字符串上滑动的窗口，窗口边界为[i,j)，窗口大小为j-i
//j向右逐步滑动，滑动失败(遇到重复字符)则舍弃左边字符(i向右滑动)，滑动成功则更新max
var lengthOfLongestSubstring = function (s) {
    var max = 0, i = 0, j = 0;
    var set = {};
    while (j < s.length) {
        if (set[s[j]]) {
            set[s[i++]] = false;
        } else {
            set[s[j++]] = true;
            max = Math.max(max, j - i);
        }
    }
    return max;
};