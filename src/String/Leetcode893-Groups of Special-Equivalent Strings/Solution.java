import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public int numSpecialEquivGroups(String[] A) {
        HashSet<Map<Character,Integer>> hs=new HashSet<>();
        for (int i=0;i<A.length;++i){
            hs.add(count(A[i]));
        }
        return hs.size();
    }
    public Map<Character,Integer> count(String s){
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int i=0;i<s.length();i+=2){//奇数
            char temp=s.charAt(i);
            hm.put(temp,!hm.containsKey(temp)? 1:hm.get(temp)+1);
        }
        for (int i=1;i<s.length();i+=2){//偶数数
            char temp= (char) (s.charAt(i)+26);//为了与奇数区分
            hm.put(temp,!hm.containsKey(temp)? 1:hm.get(temp)+1);
        }
        return hm;
    }
}
/**
 * 解题思路：
 * -用map统计每个元素奇数位出现次数和偶数位出现次数
 * -依次把统计结果加入set中去重
 * -返回去重数量
 * */
