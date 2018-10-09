public class Leetcode888n {
    public int[] fairCandySwap(int[] A, int[] B) {
        int counta=0,countb=0;
        int[] res=new int[2];
        for(int i=0;i<A.length;++i){
            counta+=A[i];
        }
        for (int i=0;i<B.length;++i){
            countb+=B[i];
        }
        for (int i=0;i<A.length;++i){
            int aNeedToExch=A[i];
            for (int j=0;j<B.length;++j){
                int bNeedToExch=B[j];
                if ((counta+(bNeedToExch-aNeedToExch))==(countb+(aNeedToExch-bNeedToExch))){
                    res[0]=aNeedToExch;
                    res[1]=bNeedToExch;
                }
            }
        }
        return res;
    }
}
