import java.util.Arrays;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Leetcode889n {//uwi的做法，作为参考
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        return dfs(pre, post);
    }

    TreeNode dfs(int[] pre, int[] post)
    {
        if(pre.length == 0)return null;
        assert pre[0] == post[post.length-1];
        TreeNode me = new TreeNode(pre[0]);
        if(pre.length >= 2){
            for(int i = 0;i < post.length;i++){
                if(post[i] == pre[1]){
                    TreeNode L = dfs(Arrays.copyOfRange(pre, 1, i+2),
                            Arrays.copyOfRange(post, 0, i+1)
                    );
                    TreeNode R = dfs(Arrays.copyOfRange(pre, i+2, pre.length),
                            Arrays.copyOfRange(post, i+1, post.length-1)
                    );
                    me.left = L;
                    me.right = R;
                    break;
                }
            }
        }
        return me;
    }
}
