import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CBTInserter {
    ArrayList<TreeNode> al;
    TreeNode r;
    public CBTInserter(TreeNode root) {
        r=root;
        al=new ArrayList<>();
//        al.add(null);
        lever(r,al);
    }

    public int insert(int v) {
        TreeNode needToAddTn=new TreeNode(v);
        TreeNode father=al.get((al.size()-1)/2);
        if ((al.size()+1)%2==0){
            father.left=needToAddTn;
        }else {
            father.right=needToAddTn;
        }
        al.add(needToAddTn);
        return father.val;
    }

    public TreeNode get_root() {
        return al.get(0);
    }

    public void lever(TreeNode tn, List list){
        Queue<TreeNode> queue=new ArrayDeque();
        queue.add(tn);
        while(!queue.isEmpty()){
            TreeNode tempTn=queue.remove();
            list.add(tempTn);
            if (tempTn.left!=null){
                queue.add(tempTn.left);
            }
            if (tempTn.right!=null){
                queue.add(tempTn.right);
            }
        }
    }
}
