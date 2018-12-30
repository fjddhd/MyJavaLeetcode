import java.util.ArrayList;
import java.util.HashSet;

public class Leetcode967 {
    public static int[] numsSameConsecDiff(int N, int K) {
        if (N<1)
            return new int[0];
        ArrayList<Integer> al=new ArrayList<>();
        for (int i=0;i<=9;++i){
            al.add(i);
        }
        if (N>1){
            al.remove(0);
        }
        for (int i=0;i<N-1;++i){//n-1次
            ArrayList<Integer> al1=new ArrayList<>();
            int ji=(int) Math.pow(10,i);
            for (int j=0;j<al.size();++j){
                int a=al.get(j);
                int last=a%10;//取最后一位
                a*=10;
                if (last-K>=0)
                    al1.add(a+(last-K));
                if (last+K<=9)
                    al1.add(a+(last+K));
            }
            al=new ArrayList<>(al1);
        }
        int[] res=new int[al.size()];
        HashSet hs=new HashSet(al);
        al=new ArrayList<>(hs);
        for (int i=0;i<al.size();++i){
            res[i]=al.get(i);
        }
        return res;

    }
}
