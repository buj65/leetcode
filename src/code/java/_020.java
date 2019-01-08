package code.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _020 {
    Map<Character, Character> map;

    public _020() {
        map = new HashMap<Character, Character>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            // if 左括号 放进stack
            // if 右括号 能否消除 ? 消除 : 返回false
            char c = s.charAt(i);
            if ("{[(".indexOf(c) != -1) {
                stack.push(c);
            } else if ("}])".indexOf(c) != -1) {
                if (stack.isEmpty() || map.get(c) != stack.pop()) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
