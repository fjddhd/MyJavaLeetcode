public class Solution {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */

        int sum=0;
        public int sumOfLeftLeaves(TreeNode root) {
            traLeft(root);
            return sum;
        }
        public void traLeft(TreeNode tn){
            if(tn==null)
                return;
            else{
                if(tn.left!=null){
                    if(tn.left.left==null && tn.left.right==null){
                        sum+=tn.left.val;
                    }
                    traLeft(tn.left);
                }
                if(tn.right!=null){
                    traLeft(tn.right);
                }
            }
        }
    }

