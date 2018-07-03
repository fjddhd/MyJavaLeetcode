public class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length-1;//行数
        int n=grid[0].length-1;//列数
        for (int i=0;i<=m;++i){
            for (int j=0;j<=n;++j){
                if (i>0 && j>0){
                    grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
                }
                else if (i==0 && j>0){//第一行
                    grid[i][j]+=grid[i][j-1];
                }
                else if (i>0 && j==0){//第一列
                    grid[i][j]+=grid[i-1][j];
                }
            }
        }
        return grid[m][n];
    }
}
