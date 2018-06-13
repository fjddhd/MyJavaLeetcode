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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> al=new ArrayList();
        ft(root,al);
        return al;
        
    }
    public void ft(TreeNode tn,List<Integer> l){
        if(tn==null){
            return;
        }
        l.add(tn.val);
        ft(tn.left,l);
        ft(tn.right,l);
    }
}