import java.util.ArrayList;

public class Solution {
    public int calPoints(String[] ops) {
        int sum=0;
        ArrayList<Integer> result=new ArrayList<>();
        for (int i=0;i<ops.length;++i){
            switch (ops[i]){
                case "C":
                    result.remove(result.size()-1);break;
                case "D":
                    result.add(2*result.get(result.size()-1));break;
                case "+":
                    result.add(result.get(result.size()-1)+result.get(result.size()-2));break;
                default:
                    result.add(Integer.parseInt(ops[i]));break;
            }
        }
        for (int i=0;i<result.size();++i){
            sum+=result.get(i);
        }
        return sum;
    }
}
