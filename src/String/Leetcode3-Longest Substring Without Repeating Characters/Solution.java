import java.util.ArrayList;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int beg,end=1,alFirst=0,maxCount=0;
        if (s.length()<2)
            return s.length();
        ArrayList<Character> al=new ArrayList<>();
        al.add(s.charAt(0));
        while (end<s.length()){
            if (!al.contains(s.charAt(end))){
                al.add(s.charAt(end++));
                maxCount=Math.max(maxCount,al.size());
            }
            else {
                beg=al.indexOf(s.charAt(end))+alFirst;
                al.clear();
                end=beg+1;
                alFirst=end;
            }
        }
        maxCount=Math.max(maxCount,al.size());
        return maxCount;
    }
}
