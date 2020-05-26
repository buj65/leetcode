package code.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q020 {
    Map<Character, Character> map;

    public Q020() {
        map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            // if 左括号 放进stack
            // if 右括号 能否消除 ? 消除 : 返回false
            char c = s.charAt(i);
            if ("{[(".indexOf(c) != -1) {
                stack.push(c);
            } else if ("}])".indexOf(c) != -1) {
                // stack为空pop将抛出异常
                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
