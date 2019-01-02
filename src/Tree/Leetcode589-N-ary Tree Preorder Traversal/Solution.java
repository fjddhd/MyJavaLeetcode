import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> al=new ArrayList<>();
    public List<Integer> preorder(Node root) {
        tra(root);
        return al;
    }
    public void tra(Node node){
        if (node==null)
            return;
        else
            al.add(node.val);
        for (int i=0;i<node.children.size();++i){
            tra(node.children.get(i));
        }
    }
}
