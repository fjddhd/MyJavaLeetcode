public class Solution {
    public static int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int orien=0;//0~3右下左上
        int x=0,y=0;
        res[x][y]=1;
        for (int i=2;i<=n*n;++i){
           if(orien==0&& y+1>=n ||  orien==1&&x+1>=n || orien==2&&y-1<0 ||  orien==3&&x-1<0){
                i--;
                orien=(orien+1)%4;
                continue;
            }
            if (orien==3&&res[x-1][y]!=0 ||orien==2&&res[x][y-1]!=0 ||orien==1&&res[x+1][y]!=0 || orien==0&&res[x][y+1]!=0){
                i--;
                orien=(orien+1)%4;
                continue;
            }
            if (orien==0){
                res[x][++y]=i;
            }
            else if (orien==1){
                res[++x][y]=i;
            }
            else if (orien==2){
                res[x][--y]=i;
            }
            else {
                res[--x][y]=i;
            }
        }
        return res;
    }
}
