public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int length=nums.length;
        if (nums[0]==target)
            return 0;
        if (nums[length-1]<target)
            return length-1;
        for (int i=1;i<length;++i){
            if (nums[i]==target)
                return i;
            if (nums[i]>target && target>nums[i-1])
                return i;
        }
        return 0;
    }
}
