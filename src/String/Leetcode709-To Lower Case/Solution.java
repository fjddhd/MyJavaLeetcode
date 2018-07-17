class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();++i){
            char temp=str.charAt(i);
            if(temp>='A' && temp<='Z')
                temp=(char)(temp+32);
            sb.append(temp);               
        }
        return sb.toString();
    }
}