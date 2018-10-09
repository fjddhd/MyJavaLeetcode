import java.util.ArrayList;

public class Solution877 {
    public boolean stoneGame(int[] piles) {
        ArrayList<Integer> al=new ArrayList<>();
        for (int i=0;i<piles.length;++i){
            al.add(piles[i]);
        }
        int sumA=0,sumL=0;
        for (int i=0;i<piles.length;++i){
            if (i%2==1){//lee拿
                if (al.get(0)>=al.get(al.size()-1)) {
                    sumL += al.get(0);
                    al.remove(0);
                }
                else {
                    sumL+=al.get(al.size()-1);
                    al.remove(al.size()-1);
                }
            }
            else {
                if (al.get(0)>=al.get(al.size()-1)) {
                    sumA += al.get(0);
                    al.remove(0);
                }
                else {
                    sumA+=al.get(al.size()-1);
                    al.remove(al.size()-1);
                }
            }
        }
        if (sumA>sumL)
            return true;
        else
            return false;
    }
}
