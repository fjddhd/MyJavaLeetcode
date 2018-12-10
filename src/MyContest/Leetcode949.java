import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Leetcode949 {
    public static String largestTimeFromDigits(int[] A) {
        Arrays.sort(A);
        ArrayList<Integer> al=new ArrayList<>();
        for (int i=0;i<4;++i){
            al.add(A[i]);
        }
        StringBuilder sb=new StringBuilder();
        int maxHours=-1;
        for (int i=0;i<al.size();++i){
            int ten=10*al.get(i);
            if (ten>20)
                break;
            for (int j=0;j<al.size();++j){
                if (j==i)
                    continue;
                int numHours=al.get(j);
                if (ten+numHours<24) {
                    int minMinute=10;
                    for (int k = 0; k < al.size(); ++k) {
                        if (k==j || k==i)
                            continue;
                        minMinute=Math.min(al.get(k),minMinute);
                    }
                    if (minMinute>5)
                        continue;
                    maxHours = Math.max(maxHours, ten + numHours);
                }
                else
                    break;
            }
        }
        if (maxHours==-1)
            return new String();

        if (maxHours>9)
            sb.append(maxHours);
        else {
            sb.append(0);
            sb.append(maxHours);
        }
        sb.append(':');

        Iterator<Integer> it=al.iterator();
        while (it.hasNext()){
            int k=it.next();
            if (k==maxHours/10){
                it.remove();
                break;
            }
        }
        it=al.iterator();
        while (it.hasNext()){
            int k=it.next();
            if (k==maxHours%10){
                it.remove();
                break;
            }
        }

        if (al.get(1)<6) {
            sb.append(al.get(1));
            sb.append(al.get(0));
        }
        else if (al.get(0)>5)
            return new String();
        else {
            sb.append(al.get(0));
            sb.append(al.get(1));
        }
        return sb.toString();
    }
}
