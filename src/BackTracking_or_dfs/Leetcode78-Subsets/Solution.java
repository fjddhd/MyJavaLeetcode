import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> al;
    public List<List<Integer>> subsets(int[] nums) {
        Integer[] Nums=new Integer[nums.length];
        for (int i=0;i<nums.length;++i){
            Nums[i]=nums[i];
        }
        al=Arrays.asList(Nums);
        res.add(al);
        res.add(new ArrayList());
        for (int i=0;i<al.size();++i){
            Dfs(new ArrayList<>(), i);
        }
        return res;
    }
    public void Dfs(List<Integer> list,int index){
        if (list.size()==al.size()-1 || index>al.size()-1)
            return;
        ArrayList<Integer> temp=new ArrayList(list);
        temp.add(al.get(index));
        res.add(temp);
        for (int i=index+1;i<al.size();++i) {
            Dfs(new ArrayList(temp), i);
        }

    }
}
