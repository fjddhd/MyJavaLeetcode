public class Leetcode896 {
    public boolean isMonotonic(int[] A) {
        if(A.length<=1)
            return true;
        int k=1;
        while (A[k-1]==A[k]){
            k++;
            if(k>=A.length)
                return true;
        }
        if (A[k]>A[k-1]){
            for (int i=k;i<A.length;++i){
                if (A[i-1]>A[i])
                    return false;
            }
        }
        else {
            for (int i=k;i<A.length;++i){
                if (A[i-1]<A[i])
                    return false;
            }
        }
        return true;
    }
}
