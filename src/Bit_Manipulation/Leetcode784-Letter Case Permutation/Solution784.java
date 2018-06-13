import java.util.ArrayList;
import java.util.List;

public class Solution784 {
    public List<String> letterCasePermutation(String S) {
        ArrayList<String> al=new ArrayList<>();
        StringBuffer sb=new StringBuffer(S);
        dfs(S,0,al,sb);
        return al;
    }
    public void dfs(String S,int index,ArrayList<String> al,StringBuffer sb1){
        int i=index;
        StringBuffer sb=new StringBuffer(sb1);
        while(i<S.length()){
            if (sb.charAt(i)>=48 && sb.charAt(i)<=57){
                ++i;
            }
            else if (sb.charAt(i)>=65 && sb.charAt(i)<=90){
                dfs(S,i+1,al,sb);
                sb.replace(i,i+1, String.valueOf(Character.toLowerCase(sb.charAt(i))));
                break;
            }
            else if (sb.charAt(i)>=97 && sb.charAt(i)<=122){
                dfs(S,i+1,al,sb);
                sb.replace(i,i+1, String.valueOf(Character.toUpperCase(sb.charAt(i))));
                break;
            }
            al.add(sb.toString());
        }
    }
}
