import java.util.ArrayList;
import java.util.Collections;

public class Leetcode965 {
    ArrayList<Integer> al=new ArrayList();
    public boolean isUnivalTree(TreeNode root) {
        tra(root);
        Collections.sort(al);
        return al.get(0)==al.get(al.size()-1);

    }
    public void tra(TreeNode root){
        if(root==null)
            return;
        al.add(root.val);
        tra(root.left);
        tra(root.right);
    }
}
