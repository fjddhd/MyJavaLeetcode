import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Leetcode954 {
    public static boolean canReorderDoubled(int[] A) {//不正确
//        ArrayList<Integer> alMinus=new ArrayList<>();
//        ArrayList<Integer> alPlus=new ArrayList<>();
//        ArrayList<Integer> al=new ArrayList<>();
//        int countForZero=0;
//        for (int i=0;i<A.length;++i){
//            if (A[i]>0){
//                alPlus.add(A[i]);
//            }
//            else if (A[i]==0){
//                countForZero++;
//            }
//            else {
//                alMinus.add(A[i]);
//            }
//        }
//        Collections.sort(alMinus);
//        Collections.sort(alPlus);
//        Collections.reverse(alMinus);
//        for (int i=0;i<alMinus.size();++i){
//            al.add(alMinus.get(i));
//        }
//        for (int i=0;i<countForZero;++i){
//            al.add(0);
//        }
//        for (int i=0;i<alPlus.size();++i){
//            al.add(alPlus.get(i));
//        }
//
//        for (int i=0;i<al.size()/2;++i){
//            if (al.get(i*2+1)!=al.get(i)*2) {
//                return false;
//            }
//        }
//
//        return true;

        ArrayList<Integer> alMinus=new ArrayList<>();
        ArrayList<Integer> alPlus=new ArrayList<>();
        int countForZero=0;
        for (int i=0;i<A.length;++i){
            if (A[i]>0){
                alPlus.add(A[i]);
            }
            else if (A[i]==0){
                countForZero++;
            }
            else {
                alMinus.add(A[i]);
            }
        }
        int need=Math.max(countForZero/2,0);
        if (countForZero%2==1)
            return false;

        Collections.sort(alMinus);
        Collections.sort(alPlus);
        Collections.reverse(alMinus);

        for (int i=0;i<alMinus.size()/2;++i){
            if (alMinus.contains(alMinus.get(i)*2)){
                need++;
                alMinus.remove(new Integer(i));
                alMinus.remove(new Integer(alMinus.get(i)*2));
                i=0;
            }
        }
        for (int i=0;i<alPlus.size()/2;++i){
            if (alPlus.contains(alPlus.get(i)*2)){
                need++;
                alPlus.remove(new Integer(i));
                alPlus.remove(new Integer(alPlus.get(i)*2));
                i=0;
            }
        }
        if (need==A.length/2) {
            return true;
        }
        else {
            return false;
        }
    }
}
