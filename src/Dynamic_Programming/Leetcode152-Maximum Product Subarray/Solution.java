class Solution {
    public int maxProduct(int[] nums) {
        int maxnow,maxlast=nums[0],minnow,minlast=nums[0],maxall=nums[0];
        for(int i=1;i<nums.length;++i){
            maxnow=Math.max(nums[i],Math.max(nums[i]*maxlast,nums[i]*minlast));
            minnow=Math.min(nums[i],Math.min(nums[i]*minlast,nums[i]*maxlast));
            maxall=Math.max(maxall,maxnow);
            maxlast=maxnow;
            minlast=minnow;            
        }
        return maxall;
    }
}