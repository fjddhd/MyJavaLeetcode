import java.util.Arrays;

public class Leetcode931 {
    public static int minFallingPathSum(int[][] A) {//动态规划
        int len=A.length;
        for (int i=len-2;i>=0;--i){
            for(int j=0;j<len;++j){
                if (j==0){
                    A[i][j]+=Math.min(A[i+1][j],A[i+1][j+1]);
                }
                else if (j==len-1){
                    A[i][j]+=Math.min(A[i+1][j-1],A[i+1][j]);
                }
                else {
                    A[i][j]+=Math.min(A[i+1][j-1],Math.min(A[i+1][j],A[i+1][j+1]));
                }
            }
        }
        Arrays.sort(A[0]);
        return A[0][0];
    }
}
