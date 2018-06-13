import java.util.Arrays;

public class Leetcode566 {
    public static void main(String[] args){
        Solution566 S=new Solution566();
        int[][] test=new int[][]{{1,2,3,4}};
        int[][] a=S.matrixReshape(test,2,2);
        for (int i=0;i<2;++i){
            for (int j=0;j<2;++j){
                System.out.println(a[i][j]);
            }

        }
    }
}
