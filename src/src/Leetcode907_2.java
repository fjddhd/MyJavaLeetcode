public class Leetcode907_2 {
    public int sumSubarrayMins(int[] A) {//超出内存
        long all=0;
        int[][] map=new int[A.length][A.length];
        for (int i=0;i<A.length;++i){
            for (int j=0;j<A.length-i;++j){
                if (i!=0){
                    map[i][j]=Math.min(A[j+i],map[i-1][j]);
                }
                else if (i==0) {
                    map[i][j] = A[j + i];
                }
                all+=map[i][j];
            }
        }
        return (int) (all%(Math.pow(10,9)+7));
    }
}
