import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        ArrayList<Integer> al=new ArrayList<>();
        al.add(Comparediff(timePoints.get(0),timePoints.get(timePoints.size()-1)));
        for (int i=1;i<timePoints.size();++i){
            al.add(Comparediff(timePoints.get(i-1),timePoints.get(i)));
        }
        Collections.sort(al);
        return al.get(0);
    }

    int Comparediff(String a,String b){//一天一共1440分钟
        int aTime=60*(a.charAt(0)*10+a.charAt(1))+a.charAt(3)*10+a.charAt(4);
        int bTime=60*(b.charAt(0)*10+b.charAt(1))+b.charAt(3)*10+b.charAt(4);
        int minusAbs=Math.abs(aTime-bTime);
        return Math.min(minusAbs,1440-minusAbs);
    }
}
