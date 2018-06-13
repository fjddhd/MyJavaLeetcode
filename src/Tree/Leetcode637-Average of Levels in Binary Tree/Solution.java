import java.util.ArrayList;
import java.util.List;
/**
 * 完全二叉树第i层最多有2^（i-1）个节点,但是该题分母中不包含null节点
 *
 * **/

public class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<ArrayList<Double>> al=new ArrayList<>();
        al=lever(root);
        int len=al.size();
        ArrayList<Double> result=new ArrayList<>();
        for (int i=0;i<len;++i){
            double temp=0;
            for (int j=0;j<al.get(i).size();++j){
                temp+=al.get(i).get(j);
            }
            result.add(temp/al.get(i).size());
        }
        return result;
    }

    public ArrayList<ArrayList<Double>> lever(TreeNode root){
        ArrayList<ArrayList<Double>> L=new ArrayList<>();
        int front=-1,rear=-1;
        ArrayList<TreeNode> al=new ArrayList<>();
        ArrayList<Double> al1=new ArrayList<>();
        if (root==null)
            return L;
        if (root!=null){
            rear++;al.add(root);//根节点入队
            rear++;al.add(null);
            while(front!=rear){
                front++;TreeNode tn=al.get(front);//出队一个节点
                if (tn!=null){
                    al1.add((double) tn.val);
                    if (tn.left!=null){
                        rear++;al.add(tn.left);
                    }
                    if (tn.right!=null){
                        rear++;al.add(tn.right);
                    }
                }
                else {
                    if (!al1.isEmpty()){
                        rear++;al.add(null);
                        L.add(al1);
                        al1=new ArrayList<>();
                    }
                }
            }
        }
        return L;
    }
}
