import java.util.ArrayList;

/**
 *implement by using queue
 */

public class MyStack {
    ArrayList<Integer> queue,asist;
    int front,rear;
    /** Initialize your data structure here. */
    public MyStack() {
        queue=new ArrayList<>();
        front=0;
        rear=0;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(rear++,x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        asist=new ArrayList<>();
        //依次pop队列所有元素,并依次存入asist数组
        int size=rear-front;
        for (int i=0;i<size;++i){
            asist.add(queue.get(front++));
        }
        //从辅助数组中取出top值保存到变量result中，并将其从asist中删掉
        int result=asist.get(asist.size()-1);
        asist.remove(asist.size()-1);
        //依次把之前元素push进队列
        for (int i=0;i<asist.size();++i){
            queue.add(rear++,asist.get(i));
        }
        return result;
    }

    /** Get the top element. */
    public int top() {
        asist=new ArrayList<>();
        //依次pop队列所有元素,并依次存入asist数组
        int size=rear-front;
        for (int i=0;i<size;++i){
            asist.add(queue.get(front++));
        }
        //依次把之前元素push进队列
        for (int i=0;i<asist.size();++i){
            queue.add(rear++,asist.get(i));
        }
        return asist.get(asist.size()-1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        //队列的判空方法是首尾指针相同
        if (rear==front)
            return true;
        else
            return false;
    }
}
