public class Leetcode887 {//本算法是建立在方阵基础上的，否则考虑捕获数组越界异常为0的方法
    public int projectionArea(int[][] grid) {
        int xy=0,xz=0,yz=0,maxX=grid.length,maxY=0;
        for (int i=0;i<grid.length;++i){
            xy+=grid[i].length;
            maxY=Math.max(maxY,grid[i].length);
            int tempXZ=0,tempYZ=0;
            for (int j=0;j<grid[i].length;++j){
                tempXZ=Math.max(tempXZ,grid[i][j]);
                tempYZ=Math.max(tempYZ,grid[j][i]);
                if(grid[i][j]==0)
                    xy--;
            }
            xz+=tempXZ;
            yz+=tempYZ;
        }
        return yz+xz+xy;
    }
}
