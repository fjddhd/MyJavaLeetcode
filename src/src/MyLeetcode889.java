import java.util.Arrays;

public class MyLeetcode889 {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {

        return creatTree(pre,post);
    }
    public TreeNode creatTree(int[] pre, int[] post){
        if(pre.length==0)
            return null;
        TreeNode tn=new TreeNode(pre[0]);
        if(pre.length >= 2){
            for(int i = 0;i < post.length;i++){
                if(post[i] == pre[1]){
                    TreeNode L = creatTree(Arrays.copyOfRange(pre, 1, i+2),
                            Arrays.copyOfRange(post, 0, i+1)
                    );
                    TreeNode R = creatTree(Arrays.copyOfRange(pre, i+2, pre.length),
                            Arrays.copyOfRange(post, i+1, post.length-1)
                    );
                    tn.left = L;
                    tn.right = R;
                    break;
                }
            }
        }
        return tn;

    }
}
