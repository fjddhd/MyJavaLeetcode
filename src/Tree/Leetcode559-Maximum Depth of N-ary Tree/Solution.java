import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
        return tra(root);
    }
    public int tra(Node node){
        int max=1;
        for (int i=0;i<node.children.size();++i){
            max=Math.max(max,1+tra(node.children.get(i)));
        }
        return max;
    }
}
