import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> aster=new ArrayList<>();
        for (int i=0;i<asteroids.length;++i){
            aster.add(asteroids[i]);
        }
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<aster.size();++i){
            if (stack.empty() && aster.get(i)>0)
                stack.push(aster.get(i));
            else if (!stack.empty() && aster.get(i)>0) {
                stack.pop();
                stack.push(aster.get(i));
            }
            else if (!stack.empty() && aster.get(i)<0){
                if (stack.peek()>aster.get(i)*(-1)){
                    aster.remove(i);
                    i=Math.max(-1,i-2);
                }
                else if (stack.peek()<aster.get(i)*(-1)){
                    aster.remove(i-1);
                    i=Math.max(-1,i-3);
                }
                else {
                    aster.remove(i);
                    aster.remove(i-1);
                    i=Math.max(-1,i-3);
                }
                stack.pop();
            }
        }
        int[] res=new int[aster.size()];
        for (int i=0;i<aster.size();++i){
            res[i]=aster.get(i);
        }
        return res;
    }
}
