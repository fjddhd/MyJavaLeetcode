import java.util.ArrayList;
class MyQueue {

    ArrayList<Integer> stack1,asist;
    int top1,top2;
    public MyQueue() {
        stack1=new ArrayList<>();
        top1=-1;
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.add(++top1,x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        asist=new ArrayList<>();
        top2=-1;
        int saved_top1=top1,re=0;
        while(stack1.size()>0){
            int temp=stack1.get(top1);
            stack1.remove(top1--);
            asist.add(++top2,temp);
        }
        re=asist.get(asist.size()-1);
        asist.remove(asist.size()-1);
        for (int i=asist.size()-1;i>=0;i--){
            stack1.add(asist.get(i));
        }
        top1=saved_top1-1;
        return re;
    }

    /** Get the front element. */
    public int peek() {
        asist=new ArrayList<>();
        top2=-1;
        int saved_top1=top1;
        while(top1>=0) {
            int temp=stack1.get(top1--);
            asist.add(++top2,temp);
        }
        top1=saved_top1;
        return asist.get(asist.size()-1);
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if (top1==-1)
            return true;
        else
            return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */