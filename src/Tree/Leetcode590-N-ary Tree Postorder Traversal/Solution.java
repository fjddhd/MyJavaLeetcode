import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> al=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root==null)
            return al;
        tra(root);
        al.add(root.val);
        return al;
    }
    public void tra(Node node){
        if (node.children.size()==0)
            return;
        for (int i=0;i<node.children.size();++i){
            tra(node.children.get(i));
            al.add(node.children.get(i).val);
        }

    }
}
