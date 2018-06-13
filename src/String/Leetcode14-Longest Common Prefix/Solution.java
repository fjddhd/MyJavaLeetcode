public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb=new StringBuffer();
        if (strs.length==0)
            return "";
        if (strs.length==1)
            return strs[0];
        int term=strs[0].length();
        for (int i=0;i<strs.length;++i){
            int l=strs[i].length();
            term=Math.min(l,term);
        }
        for (int i=0;i<term;++i){
            char t=strs[0].charAt(i);
            for (int j=1;j<strs.length;++j)
                if (strs[j].charAt(i)!=t)
                    return sb.toString();
            sb.append(t);
        }

        return sb.toString();
    }
}
