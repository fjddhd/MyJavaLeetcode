import java.util.ArrayList;

public class RecentCounter {
    ArrayList<Integer> al;
    public RecentCounter() {
        al=new ArrayList<>();
    }
    public int ping(int t) {
        al.add(t);
        int lastIndex=al.lastIndexOf(t),count=1;
        for (int i=lastIndex;i>=0 || al.get(lastIndex)-3000>al.get(i);--i){
            count++;
        }
        return count;
    }

}
