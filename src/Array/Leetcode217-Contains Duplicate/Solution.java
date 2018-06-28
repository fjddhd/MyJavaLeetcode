import java.util.HashMap;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<nums.length;++i){
            hm.put(nums[i],i);
        }
        if (nums.length!=hm.size())
            return true;
        else
            return false;
    }
}
