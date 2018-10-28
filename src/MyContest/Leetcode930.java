public class Leetcode930 {
    public static int numSubarraysWithSum(int[] A, int S) {
        int count=0,sum;
        for (int i=0;i<Math.min(A.length-S+1,A.length);++i){
            sum=A[i];
            if (sum==S){
                count++;
            }
            for (int j=i+1;j<A.length;++j){
                sum+=A[j];
                if (sum==S){
                    count++;
                }
                else if (sum>S){
                    break;
                }
            }
        }
        return count;
    }
}

