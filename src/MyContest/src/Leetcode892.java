public class Leetcode892 {
    public int surfaceArea(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int all = 0;
        int nei = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                all += grid[i][j];
                if(j+1 < m){
                    nei += Math.min(grid[i][j], grid[i][j+1]);
                }
                if(i+1 < n){
                    nei += Math.min(grid[i][j], grid[i+1][j]);
                }
                if(grid[i][j] > 0)nei += grid[i][j]-1;
            }
        }
        return all*6-nei*2;
    }
}
//不建议使用投影法，遍历每个数，累加每个小方块i，j正方向相邻面数最小值并记为重叠面
