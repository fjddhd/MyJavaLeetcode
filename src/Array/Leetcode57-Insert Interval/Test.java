import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Interval> t1=new ArrayList<>();
        t1.add(new Interval(1,2));
        t1.add(new Interval(3,5));
        t1.add(new Interval(6,7));
        t1.add(new Interval(8,10));
        t1.add(new Interval(12,16));
        Solution.insert(t1,new Interval(4,8));
    }
}
