import java.util.ArrayList;

public class Solution665 {
    public boolean checkPossibility(int[] nums) {
        int len=nums.length,mark=0;
        for(int i=1;i<len;++i){
            if (nums[i]<nums[i-1]){
                if (isoderorequ_withoutindex(nums,i) || isoderorequ_withoutindex(nums,i-1))
                    return true;
                else
                    return false;
            }
        }
        return true;
    }
    public boolean isoderorequ_withoutindex(int[] nums,int index){
        ArrayList<Integer> al=new ArrayList();
        for(int i=0;i<nums.length;++i){
            al.add(nums[i]);
        }
        al.remove(index);
        for (int i=1;i<al.size();++i){
            if (al.get(i)<al.get(i-1)){
                return false;
            }
        }
        return true;
    }
}
