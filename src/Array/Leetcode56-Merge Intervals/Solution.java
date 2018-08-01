import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
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
                intervals.remove(i);
            }
        }
        return intervals;
    }
    public Interval merge(Interval i1,Interval i2) {
        return new Interval(i1.start,Math.max(i1.end,i2.end));
    }
}
