public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();++i){
            if (s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
                if (s.charAt(i)>='A' && s.charAt(i)<='Z')
                    sb.append((char)(s.charAt(i)+32));
                else
                    sb.append(s.charAt(i));
            }
        }
        s=sb.toString();
        if(s.length()==0)
            return true;
        int i=0,k=s.length()-1;
        while (i<k){
            if (s.charAt(i)!=s.charAt(k))
                return false;
            i++;
            k--;
        }
        return true;
    }
}
