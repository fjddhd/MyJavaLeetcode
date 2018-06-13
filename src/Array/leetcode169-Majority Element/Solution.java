class Solution {
    public int majorityElement(int[] nums) {
        int length=nums.length;
        Arrays.sort(nums);
        return nums[length/2];
    }
}