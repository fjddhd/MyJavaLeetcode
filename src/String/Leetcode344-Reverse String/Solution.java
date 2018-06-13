class Solution {
    public String reverseString(String s) {
        StringBuffer Sb_result=new StringBuffer();
        for(int i=s.length()-1;i>=0;--i)
            Sb_result.append(s.charAt(i));
        String result=Sb_result.toString();
        return result;
    }
}