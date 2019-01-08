/**
 * @param {string} s
 * @return {boolean}
 */
var map = {"}": "{", "]": "[", ")": "("};
var isValid = function (s) {
    var stack = [];
    for (var i = 0; i < s.length; i++) {
        //if 左括号 放进stack
        //if 右括号 能否消除 ? 消除 : 返回false
        var c = s[i];
        if ("{[(".indexOf(c) > -1) {
            stack.push(c);
        } else if ("}])".indexOf(c) > -1) {
            if (stack.pop() !== map[c]) {
                return false;
            }
        }
    }
    return stack.length === 0;
};