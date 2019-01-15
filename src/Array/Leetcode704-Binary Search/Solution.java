public class Solution {
    public int search(int[] nums, int target) {
        int mid=0,low=0,high=nums.length-1;
        while(low<=high){
            mid=(high+low)/2;
            if(nums[mid]<target){
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else
                return mid;
        }
        return -1;
    }
}
