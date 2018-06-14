import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int findLHS(int[] nums) {
        int max=0;
        ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<nums.length;++i){
            if (!al.contains(nums[i]))
                al.add(nums[i]);
            if (!hm.containsKey(nums[i]))
                hm.put(nums[i],1);
            else
                hm.put(nums[i],hm.get(nums[i])+1);
        }
        Object[] all=al.toArray();
        Arrays.sort(all);al.clear();
        for (int i=0;i<all.length;++i)
            al.add((Integer) all[i]);
        for (int i=1;i<al.size();++i){
            if (al.get(i)==al.get(i-1)+1){
                max=Math.max(max,hm.get(al.get(i))+hm.get(al.get(i-1)));
            }
        }
        return max;
    }
}
