import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution872 {
    ArrayList<Integer> al1=new ArrayList<>();
    ArrayList<Integer> al2=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        firstTra(root1,al1);
        firstTra(root2,al2);
        if (al1.size()!=al2.size())
            return false;
        for (int i=0;i<al1.size();++i){
            if (al1.get(i)!=al2.get(i))
                return false;
        }
        return true;
    }

    void firstTra(TreeNode tn, ArrayList al){
        if (tn!=null){
            if (tn.left==null && tn.right==null)
                al.add(tn.val);
            firstTra(tn.left,al);
            firstTra(tn.right,al);
        }
    }
}

