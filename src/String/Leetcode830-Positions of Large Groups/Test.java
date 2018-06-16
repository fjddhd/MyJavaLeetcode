import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] a){
        Solution s=new Solution();
        String ss="aaa";
        List<List<Integer>> aa=s.largeGroupPositions(ss);
        for (int i=0;i<aa.size();++i) {
            System.out.println(Arrays.toString(new List[]{aa.get(i)}));
        }
    }
}
