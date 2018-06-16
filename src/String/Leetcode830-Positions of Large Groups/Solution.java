import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        int beg=0,end=0,count=1;
        List<List<Integer>> result=new ArrayList();
        List<Integer> al=new ArrayList<>();
        for (int i=1;i<S.length();++i){
            if (S.charAt(i)==S.charAt(i-1)){
                end=i;
            }
            else {
                if (end-beg>=2) {
                    al = new ArrayList<>();
                    al.add(beg);
                    al.add(end);
                    result.add(al);
                }
                beg=end+1;
                end=end+1;
            }
        }
        if (end-beg>=2) {
            al = new ArrayList<>();
            al.add(beg);
            al.add(end);
            result.add(al);
        }
        beg=end+1;
        end=end+1;
        return result;
    }
}
