import java.util.HashMap;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs=str.split(" ");
        HashMap<Character,String> hm=new HashMap<>();
        if(strs.length!=pattern.length())
            return false;
        for (int i=0;i<strs.length;++i){
            if (!hm.containsKey(pattern.charAt(i)) && !hm.containsValue(strs[i]))
                hm.put(pattern.charAt(i),strs[i]);
        }
        for (int i=0;i<strs.length;++i){
            if (!hm.get(pattern.charAt(i)).equals(strs[i]))
                return false;
        }
        return true;
    }
}
