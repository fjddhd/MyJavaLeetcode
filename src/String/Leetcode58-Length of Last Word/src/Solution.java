public class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length(),lastspace=0;
        if (len==0)
            return 0;
        for (int i=0;i<len;++i){
            if (s.charAt(i)==' '){
                lastspace=i;
            }
        }
        return len-lastspace;
    }
}
