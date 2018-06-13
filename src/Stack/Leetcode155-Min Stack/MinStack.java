import java.util.ArrayList;
import java.util.List;

public class MinStack {
    int top;
    ArrayList<Integer> stack;

    /** initialize your data structure here. */
    public MinStack() {
        this.top=-1;
        this.stack=new ArrayList<>();
    }

    public void push(int x) {
        stack.add(++top,x);
    }

    public void pop() {
        stack.remove(top--);
    }

    public int top() {
        return stack.get(top);
    }

    public int getMin() {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=top;++i){
            if(stack.get(i)<min){
                min=stack.get(i);
            }
        }
        return min;
    }
}
