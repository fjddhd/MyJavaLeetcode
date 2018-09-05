import java.util.ArrayList;
import java.util.Collections;

public class Leetcode897 {//有很神奇的测试样例，搞不懂题目要求
    ArrayList<Integer> al=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        tra(root);
        Collections.sort(al);
        TreeNode tn=new TreeNode(al.get(0));
        TreeNode cur=tn;
        for (int i=1;i<al.size();++i){
            cur.right=new TreeNode(al.get(i));
            cur=cur.right;
        }
        return tn;
    }
    public void tra(TreeNode root){
        if (root==null)
            return;
        al.add(root.val);
        tra(root.left);
        tra(root.right);
    }
}
