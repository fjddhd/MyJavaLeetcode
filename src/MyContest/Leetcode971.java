import java.util.ArrayList;
import java.util.List;

public class Leetcode971 {//未成功
    public static List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        List<Integer> fail=new ArrayList<>();
        fail.add(-1);
        List<Integer> success=new ArrayList<>();
        ArrayList<ArrayList<Integer>> map=new ArrayList<>();
        for (int i=0;i<=voyage.length;++i) {//先加n+1个，序号0不用
            map.add(new ArrayList<>());
        }
        firstTra(root,map);
        for (int i=1;i<voyage.length;++i){
            if (map.get(voyage[i]).size()==0)
                continue;
            if (map.get(voyage[i]).size()==2){
                int one=map.get(voyage[i]).get(0),two=map.get(voyage[i]).get(1);
                for (int k=0;k<voyage.length;++k){
                    if (voyage[k]==one){

                        break;
                    }
                    if (voyage[k]==two){
                        success.add(i);
                        break;
                    }
                }
            }
            for (int j=0;j<i;++j){
                if (map.get(voyage[i]).contains(voyage[j]))
                    return fail;
            }
        }
        return success;
    }
    public static void firstTra(TreeNode tn,ArrayList<ArrayList<Integer>> al){
        if (tn==null)
            return;
        ArrayList<Integer> al1=al.get(tn.val);
        if (tn.left!=null){
            al1.add(tn.left.val);
            firstTra(tn.left,al);
        }
        if (tn.right!=null){
            al1.add(tn.right.val);
            firstTra(tn.right,al);
        }
    }
}
