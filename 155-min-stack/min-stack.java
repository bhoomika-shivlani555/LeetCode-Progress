class MinStack {
    Stack<Integer> s;
    Stack<Integer> minstack;
    public MinStack() {
        s=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int value) {
        if(minstack.isEmpty() || minstack.peek()>value)
            minstack.push(value);
        else
            minstack.push(minstack.peek());
        s.push(value);
    }
    
    public void pop() {
        s.pop();
        minstack.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */