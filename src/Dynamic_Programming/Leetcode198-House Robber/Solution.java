class Solution {
    public int rob(int[] nums) {
        int len=nums.length;
        int[] dp=new int[len];
        if(len==0)
            return 0;
        if(len==1)
            return nums[0];
        if(len==2)
            return Math.max(nums[0],nums[1]);
        for(int i=0;i<len;++i){
            if(i==0){
                dp[i]=nums[0];
            }
            else if(i==1){
                dp[i]=nums[1]>nums[0] ? nums[1]:nums[0];
            }
            else{
                dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
            }
        }
        return dp[len-1]>dp[len-2] ? dp[len-1]:dp[len-2];
    }
}