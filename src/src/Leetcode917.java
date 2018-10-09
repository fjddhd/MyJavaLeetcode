import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Leetcode917 {
    public String reverseOnlyLetters(String S) {
        char[] c=S.toCharArray();
        ArrayList<Character> al=new ArrayList<>();
        HashMap<Integer,Character> hm=new HashMap();
        for (int i=0;i<S.length();++i){
            if (c[i]>='a' && c[i]<='z' ||c[i]>='A' && c[i]<='Z'){
                al.add(c[i]);
            }
            else {
                hm.put(i,c[i]);
            }
        }
        Collections.reverse(al);
        int mark=0;
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<S.length();++i){
            if (!hm.containsKey(i)){
                sb.append(al.get(i-mark));
            }
            else {
                mark++;
                sb.append(hm.get(i));
            }
        }
        return sb.toString();
    }
}
