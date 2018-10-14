import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Leetcode914 {
    public static boolean hasGroupsSizeX(int[] deck) {
        int len=deck.length;
        Arrays.sort(deck);
        if (len<=1)
            return false;
        HashSet<Integer> hs=new HashSet<>();
        int count=1;
        for (int i=1;i<len;++i){
            if (deck[i]==deck[i-1]){
                count++;
            }
            else {
                hs.add(count);
                count=1;
            }
        }
        hs.add(count);

        ArrayList<Integer> al=new ArrayList<>(hs);
        Collections.sort(al);
        int mark=0;
        for (int j=2;j<=al.get(0);++j) {
            for (int i = 0; i < al.size(); ++i) {
                if (al.get(i) % j != 0) {
                    break;
                }
                if (i==al.size()-1 && al.get(i) % j == 0){
                    mark=1;
                }
            }

        }
        if (mark==1)
            return true;
        else
            return false;
    }
}
