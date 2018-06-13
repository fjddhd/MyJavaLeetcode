public class Solution {
    public boolean isMatch(String s, String p) {
        char[] cs=s.toCharArray();
        char[] cp=p.toCharArray();
        int i=0,j=0,starts=0,startp=-1;
        while(i<cs.length){
            if (cs[i]==cp[j] || cp[j]=='?'){
                ++i;
                ++j;
            }
            else if(cp[j]=='*'){
                startp=j++;
                starts=i;
            }
            else if (startp!=1){
                i=++starts;
                j=startp+1;
            }
            else
                return false;
        }
        while (cp[j++]=='*');
        return j==cp.length+1;
    }
}
