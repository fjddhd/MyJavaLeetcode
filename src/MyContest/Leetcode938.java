public class Leetcode938 {
    int count=0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        range(root,L,R);
        return count;
    }
    public void range(TreeNode root, int L, int R) {
        if(root==null)
            return;
        if(root.val>=L && root.val<=R)
            count+=root.val;
        rangeSumBST(root.left,L,R);
        rangeSumBST(root.right,L,R);
    }
}
