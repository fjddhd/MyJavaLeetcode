public class Solution {//本题不可用除法，使用线性时间复杂度，线性空间复杂度（暂不实现进阶的常数空间复杂度解法）
    public int[] productExceptSelf(int[] nums) {
        int[] leftFirst=new int[nums.length];
        int[] rightFirst=new int[nums.length];
        int[] res=new int[nums.length];
        for (int i=0;i<nums.length;++i){
            if (i==0){
                leftFirst[i]=nums[i];
            }
            else {
                leftFirst[i]=leftFirst[i-1]*nums[i];
            }
        }
        for (int i=nums.length-1;i>=0;--i){
            if (i==nums.length-1){
                rightFirst[i]=nums[i];
            }
            else {
                rightFirst[i]=rightFirst[i+1]*nums[i];
            }
        }
        for (int i=0;i<nums.length;++i){
            int l=i-1,r=i+1;
            if (l<0)
                res[i]=rightFirst[r];
            else if (r>nums.length-1)
                res[i]=leftFirst[l];
            else
                res[i]=leftFirst[l]*rightFirst[r];
        }
        return res;
    }
}
