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
    public int findTilt(TreeNode root) {
        int front=-1,rear=-1,tilt=0;
        ArrayList<TreeNode> queue=new ArrayList<>();
        if (root==null)
            return 0;
        else{
            rear++;queue.add(root);//根节点入队
            while(front!=rear){
                front++;TreeNode tn=queue.get(front);//出队一个节点
                int lt=0,rt=0;
                if (tn.left!=null){
                    rear++;queue.add(tn.left);
                    lt=countAll(tn.left);
                }
                if (tn.right!=null){
                    rear++;queue.add(tn.right);
                    rt=countAll(tn.right);
                }
                tilt+=Math.abs(lt-rt);
            }
        }
        return tilt;
    }
    public int countAll(TreeNode tn){
        int value=0;
        if(tn!=null){
            value=tn.val;
        }
        if(tn.left!=null)
            value+=countAll(tn.left);
        if(tn.right!=null)
            value+=countAll(tn.right);
        return value;
    }
}