public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
            return null;
        TreeNode tn=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(tn);
        return root;
    }
}
