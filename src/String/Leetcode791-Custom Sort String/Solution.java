import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public String customSortString(String S, String T) {
        HashMap<Integer,Character> hm=new HashMap<>();
        for (int i=0;i<S.length();++i){
            hm.put(i,S.charAt(i));
        }
        char[] sc=S.toCharArray();
        ArrayList<Character> sal=new ArrayList<>();
        char[] tc=T.toCharArray();
        ArrayList<Character> tal=new ArrayList<>();
        ArrayList<String> al=new ArrayList<>();
        for (int i=0;i<sc.length;++i){
            sal.add(sc[i]);
        }
        for (int i=0;i<tc.length;++i){
            tal.add(tc[i]);
        }
        tal.removeAll(sal);
        for (int i=0;i<hm.size();++i){
            char temp=hm.get(i);
            int count=0;
            StringBuilder sb=new StringBuilder();
            for (int j=0;j<T.length();++j)
                if (T.charAt(j)==temp)
                    count++;
            for (int j=0;j<count;++j){
                sb.append(temp);
            }
            al.add(sb.toString());
        }

        StringBuilder sb_res=new StringBuilder();
        for (int i=0;i<al.size();++i){
            sb_res.append(al.get(i));
        }
        for (int i=0;i<tal.size();++i){
            sb_res.append(tal.get(i));
        }

        return sb_res.toString();
    }
}
