import java.util.*;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result2=new ArrayList<>();
        for (int i=0;i<numRows;++i){
            List<Integer> result1=new ArrayList<>();
            result2.add(result1);
        }
        List<Integer> result1=new ArrayList<>();
        switch (numRows){
            case 0:{result2.add(result1);break;}
            case 1:{result2.get(0).add(1);break;}
            default: {
                result2.get(0).add(1);
                result2.get(1).add(1);
                result2.get(1).add(1);
                for (int i = 2; i < numRows; ++i) {
                    result2.get(i).add(1);
                    for (int j = 1; j < i; ++j) {
                        Integer plus = new Integer(result2.get(i - 1).get(j - 1).intValue() + result2.get(i - 1).get(j).intValue());
                        result2.get(i).add(plus);
                    }
                    result2.get(i).add(1);
                }
            }
        }
        return result2;
    }
}
