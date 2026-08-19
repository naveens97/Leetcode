import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> min;

    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            min.push(value);
        } else {
            stack.push(value);
            min.push(Math.min(min.peek(), value));
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