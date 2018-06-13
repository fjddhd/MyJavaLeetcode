class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int length=nums.length;
        int mark=0,max=0;
        for(int i=0;i<length;++i){
            if(nums[i]==1){
                mark++;
                if(mark>max)
                    max=mark;
            }
            else if(nums[i]==0)
                mark=0;
        }
        return max;
    }
}