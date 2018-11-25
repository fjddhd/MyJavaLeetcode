public class Leetcode941 {
    public static boolean validMountainArray(int[] A) {
        if (A.length<3)
            return false;
        int mark=0;
        for (int i=1;i<A.length;++i){
            if (mark==0) {
                if (A[i]>A[i-1]){
                    continue;
                }
                else if (A[i]==A[i-1]){
                    return false;
                }
                else {
                    mark=1;
                }
            }
            else {
                if (A[i]<A[i-1]){
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        if (mark==1)
            return true;
        else
            return false;
    }
}
