public class Leetcode908 {
    public int smallestRangeI(int[] A, int K) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for (int i=0;i<A.length;++i){
            max=max>A[i]?max:A[i];
            min=min>A[i]?A[i]:min;
        }
        if (max-min>K*2)
            return max-min-K*2;
        else
            return 0;
    }
}
