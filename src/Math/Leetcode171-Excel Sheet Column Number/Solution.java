class Solution {
     public int titleToNumber(String s) {//大写字母A~Z的ASCII表对应65~90
        int s_length=s.length(),result=0,ASCII_temp;
        for (int i=0;i<s_length;++i){
            ASCII_temp = s.charAt(i) - 64;
            if (i<s_length-1)
                result +=ASCII_temp*Math.pow(26,s_length-1-i);
            else
                result += ASCII_temp;
        }
        return result;
    }
}