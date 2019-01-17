

public class Solution {
    public static int longestPalindrome(String s) {
        int length=0;
        char[] ss=s.toCharArray();
        Boolean[] twice=new Boolean[128];
        for (int i=0;i<twice.length;++i){
            twice[i]=false;
        }
        for (char c:ss){
            twice[c]=!twice[c];
            if (twice[c]==false){
                length+=2;
            }
        }
        return length<s.length()? length+1 :length;
    }
}
