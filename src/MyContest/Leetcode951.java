import java.util.ArrayList;

public class Leetcode951 {//不对
    static ArrayList<ArrayList<Integer>> al=new ArrayList<>();
    public static boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null)
            return true;
        for (int i=0;i<100;i++){
            al.add(new ArrayList<Integer>());
        }
        fill(root1);
        return find(root2);
    }
    public static void fill(TreeNode tn){
        if(tn==null)
            return;
        int num=tn.val;
        if (tn.left!=null){
            al.get(num).add(tn.left.val);
            fill(tn.left);
        }
        if (tn.right!=null){
            al.get(num).add(tn.right.val);
            fill(tn.right);
        }
    }
    public static boolean find(TreeNode tn){
        int num=tn.val;
        if (tn.left!=null){
            if (!al.get(num).contains(tn.left.val))
                return false;
            find(tn.left);
        }
        if (tn.right!=null){
            if (!al.get(num).contains(tn.right.val))
                return false;
            find(tn.right);
        }
        return true;
    }

}
