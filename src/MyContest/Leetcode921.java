import java.util.ArrayList;
import java.util.Stack;

public class Leetcode921 {
    public int minAddToMakeValid(String S) {
        int mark=0,lianxuLeft=0;
        ArrayList<Integer> al=new ArrayList<>();
        for (int i=0;i<S.length();++i){
            if (i!=0){
                if (S.charAt(i)=='(' && S.charAt(i-1)==')'){
                    if (mark<=0) {
                        al.add(mark);
                        mark = 1;
                        continue;
                    }else {

                    }
                }
            }
            if (S.charAt(i)=='(')
                mark++;
            else if (S.charAt(i)==')' && lianxuLeft!=0){
                mark--;
                lianxuLeft++;
            }
            else {
                lianxuLeft=1;
                mark--;
            }

        }
        al.add(mark);
        int res=0;
        for (int i=0;i<al.size();++i){
            res+=Math.abs(al.get(i));
        }
        return res;
    }
}
