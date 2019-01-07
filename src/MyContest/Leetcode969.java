import java.util.ArrayList;
import java.util.List;

public class Leetcode969 {
    public static List<Integer> pancakeSort(int[] A) {
        List<Integer> res=new ArrayList<>();
        for (int i=0;i<A.length;++i){
            int needToSort=A.length-i,j;
            for (j=0;A[j]!=needToSort;++j);
            if (j!=0) {
                res.add(j+1);
                A=reversek(A,j+1);
            }
            if (A.length-i>1) {
                res.add(A.length-i);
            }
            A=reversek(A,A.length-i);
        }
        return res;
    }
    public static int[] reversek(int[] AA,int k){
        for (int i=0,j=k-1;i<j;i++,j--){
            int temp=AA[i];
            AA[i]=AA[j];
            AA[j]=temp;
        }
        return AA;
    }
}
