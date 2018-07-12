public class Solution {
    public int firstUniqChar(String s) {
        int[] counts=new int[26];
        int first=s.length(),mark=0;
        for (int i=0;i<s.length();++i){
            counts[s.charAt(i)-'a']++;
        }
        for (int i=0;i<counts.length;++i){
            int temp=s.indexOf(i+'a');
            if (counts[i]==1 && temp<first){
                mark=1;
                first=temp;
            }
        }
        if (mark==1)
            return first;
        else
            return -1;
    }
}
