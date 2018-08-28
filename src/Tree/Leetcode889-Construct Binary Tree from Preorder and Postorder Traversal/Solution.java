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
   public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return creatTree(pre,post);
   }
   public TreeNode creatTree(int[] pre, int[] post){
        if(pre.length==0)
            return null;
        TreeNode tn=new TreeNode(pre[0]);
        if(pre.length >= 2){
            for(int i = 0;i < post.length;i++){
                if(post[i] == pre[1]){//注意：copyOfRange方法前包后不包
                    TreeNode left= creatTree(Arrays.copyOfRange(pre, 1, i+2),
                            Arrays.copyOfRange(post, 0, i+1)
                    );
                    TreeNode right = creatTree(Arrays.copyOfRange(pre, i+2, pre.length),
                            Arrays.copyOfRange(post, i+1, post.length-1)
                    );
                    tn.left = left;
                    tn.right = right;
                    break;
                }
            }
        }
        return tn;
    }
}

//参考uwi的方法，本质是dfs算法