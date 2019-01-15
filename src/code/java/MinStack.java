package code.java;

import java.util.Stack;

//_155
class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> min;

    public MinStack() {
        stack = new Stack<Integer>();
        min = new Stack<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.empty()) {
            min.push(x);
        } else {
            min.push(Math.min(min.peek(), x));
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
