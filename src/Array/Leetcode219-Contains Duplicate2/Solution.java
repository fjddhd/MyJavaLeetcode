class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len=nums.length;
        for(int i=1;i<=k;++i){
            for(int j=0;j+i<len;++j){
                if(nums[j]==nums[j+i])
                    return true;
            }
        }
        return false;
    }
}