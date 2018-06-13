import java.util.Stack;

/**
 *
 * **/
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for (int i=0;i<s.length();++i){
            if (s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
                st.push(s.charAt(i));
            if (s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}') {
                if (st.empty() || st.peek() == '(' && s.charAt(i)!=')'|| st.peek() == '[' && s.charAt(i)!=']' || st.peek() == '{' && s.charAt(i)!='}')
                    return false;
                else {
                    st.pop();
                }
            }
        }
        return true;
    }
}
