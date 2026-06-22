import java.util.*;
class MinStack {
    Stack<Integer> minst = new Stack<>();
    Stack<Integer> mainst = new Stack<>();
    public MinStack() {
        
    }
    public void push(int value) {
       if(minst.isEmpty() ||value<=minst.peek()){
        minst.push(value);
       }
       mainst.push(value);
    }
    
    public void pop() {
         if((!minst.isEmpty())&&minst.peek().equals(mainst.peek())){
            minst.pop();
        }
         mainst.pop();
       
        
    }
    
    public int top() {
        if(!mainst.isEmpty()){
        return mainst.peek();
        }
        return 0;
        
    }
    
    public int getMin() {
        if(!minst.isEmpty()){
        return minst.peek();

        }
        return 0;
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