/**
 * @param {string} s
 * @return {string}
 */
var reverseString = function (s) {
    // var arr = s.split("");
    // var l = 0, r = arr.length - 1;
    // while (l < r) {
    //     var temp = arr[l];
    //     arr[l] = arr[r];
    //     arr[r] = temp;
    //     l++;
    //     r--;
    // }
    // return arr.join("");

    // var arr = [];
    // for (var i = s.length - 1; i >= 0; i--) {
    //     arr.push(s[i]);
    // }
    // return arr.join("");

    return s.split("").reverse().join("");
};