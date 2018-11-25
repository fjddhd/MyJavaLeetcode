import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Leetcode946 {
    public boolean validateStackSequences1(int[] pushed, int[] popped) {//元素i之后所有比i小的元素间必须是降序排列//超时了
        int low=1,len=pushed.length;
        HashMap<Integer,Integer> hm=new HashMap();
        for (int i=0;i<pushed.length;++i){
            hm.put(pushed[i],i);
        }

        for(int i=0;i<len;++i)//元素i从头向后依次遍历
        {
            low=hm.get(popped[i]);
            for(int j=i;j<len;++j)//从元素i开始向后遍历，验证规律
            {
                if(hm.get(popped[j])<hm.get(popped[i]))//首先要找之后比元素i小的元素
                {
                    if(hm.get(popped[j])>low)
                        return false;
                    else    //验证这些元素按照降序排列
                        low = hm.get(popped[j]);
                }
            }
        }
        return true;
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int N = pushed.length;
        Stack<Integer> stack = new Stack();

        int j = 0;
        for (int x: pushed) {
            stack.push(x);
            while (!stack.isEmpty() && j < N && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        return j == N;
    }
}
