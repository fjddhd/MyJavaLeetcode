public class Solution {
    public String longestPalindrome(String s) {
        int len=s.length(),max=0,max_index=0;
        char[] cs=s.toCharArray();
        if (len<=1)
            return s;
        for (int i=0;i<len;++i){
            int a=0,len_t=1;
            while (s.charAt(i-a)==s.charAt(i+a)){
                a++;
                if(i-a<0 || i+a>len-1)
                    break;
            }
            len_t=len_t+(a-1)*2;
            if (len_t>=max){
                max=len_t;
                max_index=i;
            }
        }
        for (int i=1;i<len;++i){
            if (cs[i]==cs[i-1]){
                int a=0,len_t=2;
                while (cs[i-a-1]==cs[i+a]){
                    a++;
                    if(i-a-1<0 || i+a>len-1)
                        break;
                }
                len_t=len_t+(a-1)*2;
                if (len_t>=max){
                    max=len_t;
                    max_index=i;
                }
            }
        }
        StringBuffer sb=new StringBuffer();
        if (max%2==1){
            for (int i=max_index-max/2;i<=max_index+max/2;++i){
                sb.append(cs[i]);
            }
        }
        else {
            for (int i=max_index-max/2;i<=max_index+max/2-1;++i){
                sb.append(cs[i]);
            }
        }
        return sb.toString();
    }
}
