/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> L=new ArrayList<>();
        ArrayList<List<Integer>> R=new ArrayList<>();
        int front=-1,rear=-1;
        ArrayList<TreeNode> al=new ArrayList<>();
        List<Integer> al1=new ArrayList<>();
        if (root==null)
            return L;
        if (root!=null){
            rear++;al.add(root);//根节点入队
            rear++;al.add(null);
            while(front!=rear){
                front++;TreeNode tn=al.get(front);//出队一个节点
                if (tn!=null){
                    al1.add(tn.val);
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
        for(int i=L.size()-1;i>=0;i--){
            R.add(L.get(i));
        }
        return R;
    }
}