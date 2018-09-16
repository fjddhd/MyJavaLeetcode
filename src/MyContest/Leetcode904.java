import java.util.ArrayList;

public class Leetcode904 {
    public int totalFruit(int[] tree) {
        ArrayList<Integer> al=new ArrayList<>();
        int nextIndex=0,max=0,res=max;
        for (int i=0;i<tree.length;++i){
            if (al.size()==0){
                al.add(tree[i]);
                max=1;
                res=Math.max(max,res);
            }
            else if (al.size()==1){
                max++;
                res=Math.max(max,res);
                if (al.contains(tree[i])){
                }
                else {
                    al.add(tree[i]);
                    nextIndex=i;
                }
            }
            else if (al.size()==2){
                if (al.contains(tree[i])){
                    max++;
                    res=Math.max(max,res);
                }
                else {
                    i=nextIndex-1;
                    al.clear();
                    max=0;
                }
            }
        }
        return res;
    }
}
