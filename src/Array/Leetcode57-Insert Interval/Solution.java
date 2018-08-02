import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        for (int i=1;i<intervals.size();++i){
            if (intervals.get(i-1).end>=intervals.get(i).start){
                Interval temp=merge(intervals.get(i-1),intervals.get(i));
                intervals.set(i-1,temp);
                intervals.remove(i--);
            }
        }
        return intervals;
    }
    public static Interval merge(Interval i1,Interval i2) {
        return new Interval(i1.start,Math.max(i1.end,i2.end));
    }
}
