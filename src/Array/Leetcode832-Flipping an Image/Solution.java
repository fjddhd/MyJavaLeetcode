import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i=0;i<A.length;++i){
            ArrayList<Integer> al=new ArrayList<>();
            for (int j=0;j<A[i].length;++j){
                al.add(Math.abs(A[i][j]-1));
            }
            Collections.reverse(al);
            Integer[] temp=al.toArray(new Integer[al.size()]);
            for (int j=0;j<A[i].length;++j){
                A[i][j]=temp[j];
            }
        }
        return A;
    }
}
