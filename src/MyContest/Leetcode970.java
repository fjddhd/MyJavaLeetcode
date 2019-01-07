import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Leetcode970 {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> res=new ArrayList<>();
        int bounds=0;
        for (int i=0;(int)Math.pow(x,i)<bound;++i){
            if (i!=0 && x==1)
                break;
            for (int j=0;(int)Math.pow(x,i)+(int)Math.pow(y,j)<=bound;++j){
                if (j!=0 && y==1)
                    break;
                bounds=(int)Math.pow(x,i)+(int)Math.pow(y,j);
                res.add(bounds);
            }
        }
        HashSet<Integer> hs=new HashSet<>(res);
        res=new ArrayList<>(hs);
        return res;
    }
}
