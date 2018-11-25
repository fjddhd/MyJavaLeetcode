import java.util.ArrayDeque;
import java.util.Arrays;

public class Leetcode945 {
    public static int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int len=A.length,maxNum=A[len-1];
        ArrayDeque<Integer> emptyNum=new ArrayDeque<>();
        ArrayDeque<Integer> repeatNum=new ArrayDeque<>();
        for (int i=1;i<len;++i){
            if (A[i]==A[i-1]){
                repeatNum.add(A[i]);
            }
            else if (A[i]>A[i-1]+1){
                for (int j=A[i-1]+1;j<A[i];++j){
                    emptyNum.add(j);
                }
            }
        }
        int res=0;
        while (!emptyNum.isEmpty() && !repeatNum.isEmpty()){
            int a=emptyNum.pop(),b=repeatNum.peek();
            if (a>b) {
                res += a - b;
                repeatNum.pop();
            }
        }
        if (!repeatNum.isEmpty()){
            int term=repeatNum.size();
            for (int i=0;i<term;++i){
                res+=maxNum+1+i-repeatNum.pop();
            }
        }
        return res;
    }
}
