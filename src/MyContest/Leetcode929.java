import java.util.HashSet;

public class Leetcode929 {
    public static int numUniqueEmails(String[] emails) {
        HashSet hs=new HashSet();
        for (int i=0;i<emails.length;++i){
            int j;
            String s=emails[i];
            StringBuilder sb=new StringBuilder();
            StringBuilder sb1=new StringBuilder();
            int markplus=0;
            for (j=0;s.charAt(j)!='@';++j){
                if (s.charAt(j)!='.' && s.charAt(j)!='+' && markplus==0){
                    sb1.append(s.charAt(j));
                }
                else if (s.charAt(j)=='.'){
                    continue;
                }
                else {
                    markplus=1;
                }
            }
            sb.append(sb1);
            sb.append(s.copyValueOf(s.toCharArray(),j+1,s.length()-j-1));
            hs.add(sb.toString());
        }
        return hs.size();
    }
}
