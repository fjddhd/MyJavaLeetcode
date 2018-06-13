class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int length=nums.length,mark_num=1,max=mark_num;
        if(length==0)
            return 0;
        for(int i=1;i<length;++i){
            if(nums[i]>nums[i-1]){
                mark_num++;
                if(mark_num>max){
                    max=mark_num;
                }
            }
            else{
                mark_num=1;
            }
        }
        return max;
    }
}