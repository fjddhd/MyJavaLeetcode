public class Solution {

    private int height;
    private int width;

    public int maxAreaOfIsland(int[][] grid) {
        height = grid.length;
        width = grid[0].length;
        int max=0;
        for(int i = 0; i< height; ++i){
            for (int j = 0; j< width; ++j){
                max=Math.max(dfs(grid,i,j),max);
            }
        }
        return max;
    }

    int dfs(int[][] grid,int h,int w){
        if (h<0 || h>=height || w<0 ||w>=width)
            return 0;
        if (grid[h][w]==0)
            return 0;
        int sum=1;
        grid[h][w]=0;//该点位进行计数后必须置零，不然会反复调用dfs
        sum+=dfs(grid,h-1,w);//上
        sum+=dfs(grid,h+1,w);//下
        sum+=dfs(grid,h,w-1);//左
        sum+=dfs(grid,h,w+1);//右
        return sum;
    }
}
