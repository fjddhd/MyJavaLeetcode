class Solution {
    public int arrayPairSum(int[] nums) {
        int len=nums.length,sum=0;
        Arrays.sort(nums);
        for(int i=1;i<=len/2;++i){
            sum+=nums[len-2*i];
        }
        return sum;
    }
}