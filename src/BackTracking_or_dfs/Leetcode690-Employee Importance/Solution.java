import java.util.HashMap;
import java.util.List;

public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer,Employee> hm=new HashMap<>();
        for (int i=0;i<employees.size();++i){
            hm.put(employees.get(i).id,employees.get(i));
        }
        return dfs(hm,id);
    }

    public int dfs(HashMap<Integer,Employee> hm,int id){
        List<Integer> subordinates= hm.get(id).subordinates;
        int res=hm.get(id).importance;
        if (subordinates.size()==0){//递归跳出
            return res;
        }
        for (int i=0;i<subordinates.size();++i){
            res+=dfs(hm,subordinates.get(i));
        }
        return res;
    }
}
