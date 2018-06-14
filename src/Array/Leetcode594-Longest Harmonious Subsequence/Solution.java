import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int findLHS(int[] nums) {
        if (nums.length==0)
            return 0;
        int max=0,count,j;
        Arrays.sort(nums);
        ArrayList<Integer> nums_al=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al_double=new ArrayList<>();
        nums_al.add(nums[0]);al.add(nums[0]);
        for (int i=1;i<nums.length;++i){
            if (nums[i]!=nums[i-1])
                al.add(nums[i]);
            nums_al.add(nums[i]);
        }
        for (int i=1;i<al.size();++i){
            if (al.get(i)==al.get(i-1)+1){
                al_double.add(al.get(i-1));
                al_double.add(al.get(i));
            }
        }
        for (int i=0;i<al_double.size();i+=2){
            int upper=al_double.get(i+1)+1;
            count=0;
            j=nums_al.indexOf(al_double.get(i));
            while (nums_al.get(j)<upper){
                count++;
                ++j;
                if (j>=nums_al.size())
                    break;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
