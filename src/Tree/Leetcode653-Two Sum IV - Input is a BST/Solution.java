import java.util.ArrayList;

public class Solution {
    ArrayList<Integer> al=new ArrayList();
    ArrayList<Integer> al1=new ArrayList();
    public boolean findTarget(TreeNode root, int k) {
        midOrder(root,k);
        if(al.size()==al1.size())
            return false;
        else
            return true;
    }
    public void midOrder(TreeNode tn,int k){
        if(tn==null)
            return;
        midOrder(tn.left,k);
        if(al.contains(k-tn.val)){
            al.add(tn.val);
        }else{
            al.add(tn.val);
            al1.add(tn.val);
        }
        midOrder(tn.right,k);
    }
}
