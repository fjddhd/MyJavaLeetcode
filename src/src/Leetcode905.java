import java.util.ArrayList;

public class Leetcode905 {
    public int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> al=new ArrayList<>();
        for (int i=0;i<A.length;++i){
            if (A[i]%2==0){
                al.add(0,A[i]);
            }
            else{
                al.add(A[i]);
            }
        }
        int[] res=new int[al.size()];
        for (int i=0;i<al.size();++i){
            res[i]=al.get(i);
        }
        return res;
    }
}
