class Solution {
    public int uniquePaths(int m, int n) {
        int[][] a=new int[m][n];
        a[0][0]=0;
        a[m-1][n-1]=0;
        if (m==1||n==1)
            return 1;
        for (int i=n-1;i>=0;--i){
            for (int j=m-1;j>=0;--j){
                if (j==m-1 || i==n-1){
                    a[j][i]=1;
                }
                else{
                    a[j][i]=a[j+1][i]+a[j][i+1];
                }
            }
        }
        return a[0][1]+a[1][0];
    }
}