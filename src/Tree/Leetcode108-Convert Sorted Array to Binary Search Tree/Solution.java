/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len=nums.length;
        if(len==0)
            return null;
        return sortedArrayToBST(nums,0,len-1);
    }
    public TreeNode sortedArrayToBST(int[] nums,int beg,int end) {
        int mid=(beg+end)/2;
        if(beg > end) {
            return null;
        }
        TreeNode tn=new TreeNode(nums[mid]);
        tn.left=sortedArrayToBST(nums,beg,mid-1);
        tn.right=sortedArrayToBST(nums,mid+1,end);
        return tn;
    }
}