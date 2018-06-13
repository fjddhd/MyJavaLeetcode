import java.util.Stack;

public class Solution {
    public String addBinary(String a, String b) {
        Stack<Character> s=new Stack<>();
        char[] ca=new char[a.length()],cb=new char[b.length()];
        for (int i=0;i<a.length();++i){
            s.push(a.charAt(i));
        }
        for (int i=0;i<a.length();++i){
            ca[i]=s.pop();
        }
        for (int i=0;i<b.length();++i){
            s.push(b.charAt(i));
        }
        for (int i=0;i<b.length();++i){
            cb[i]=s.pop();
        }
        int max_term=Math.max(a.length(),b.length()),needToAdd=0;
        for (int i=0;i<max_term;++i){
            if (i<a.length() && i<b.length()){
                char sum= (char) (ca[i]+cb[i]-48);
                if (needToAdd!=0){
                    sum+=needToAdd;
                    needToAdd=0;
                }
                if (sum<=49)
                    s.push(sum);
                else {
                    s.push((char) (48+sum%2));
                    needToAdd=1;
                }
            }
            else if (i>=a.length()){
                char sum= cb[i];
                if (needToAdd!=0){
                    sum+=needToAdd;
                    needToAdd=0;
                }
                if (sum<=49)
                    s.push(sum);
                else {
                    s.push((char) (48+sum%2));
                    needToAdd=1;
                }
            }
            else if (i>=b.length()){
                char sum= ca[i];
                if (needToAdd!=0){
                    sum+=needToAdd;
                    needToAdd=0;
                }
                if (sum<=49)
                    s.push(sum);
                else {
                    s.push((char) (48+sum%2));
                    needToAdd=1;
                }
            }
        }
        if (needToAdd==1){
            s.push('1');
        }
        StringBuffer sb=new StringBuffer();
        while (!s.empty())
            sb.append(s.pop());
        return sb.toString();
    }
}
