/*
* 为了达到时间复杂度O（n），不使用额外空间
* 利用异或
* 连续对同一个数异或运算两次，等于原被异或数
* 原数与0异或等于原数
* */
public class Solution136 {
    public int singleNumber(int[] nums) {
        int len=nums.length,result=0;
        for(int i=0;i<len;++i){
            result^=nums[i];
        }
        return result;
    }
}
