import java.util.ArrayList;

public class Solution557 {
    public String reverseWords(String s) {
        int len=s.length();
        ArrayList<StringBuffer> AL=new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        StringBuffer result=new StringBuffer();
        AL.add(sb);
        for (int i=0;i<len;++i){
            if (s.charAt(i)==32) {
                sb = new StringBuffer();
                AL.add(sb);
                continue;
            }
            sb.append(s.charAt(i));
        }
        int al_len= AL.size();
        for (int i=0;i<al_len;++i){
            StringBuffer ssp=AL.get(i);
            ssp=ssp.reverse();
            if (i!=al_len-1) {
                result.append(ssp);
                result.append(" ");
            }
            else {
                result.append(ssp);
            }
        }
     return result.toString();
    }
}
