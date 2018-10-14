import java.util.ArrayList;

/*
* 3 <= A.length <= 3000
0 <= A[i] <= 100
0 <= target <= 300*
* */
public class Leetcode923 {
    public static int threeSumMulti(int[] A, int target) {
        int[] a=new int[101];
        long res=0;
        for (int i=0;i<A.length;++i){
            a[A[i]]++;
        }

        for (int x=0;x<a.length;++x){
            if (a[x]==0)
                continue;
            for (int y=x;y<a.length;++y){
                if (a[y]==0)
                    continue;
                if (a[x]==1 && y==x){
                    continue;
                }
                for (int z=y;z<a.length;++z){
                    if (a[z]==0)
                        continue;
                    if (a[y]==1 && y==z){
                        continue;
                    }
                    if (a[y]==2 && y==z&& z==x)
                        continue;
                    if (x+y+z==target){
                        if (x==y && y==z){
                            res+=comb(a[x],3);
                        }
                        else if (x==y && y!=z){
                            int temp= (int) comb(a[x],2);
                            res+=temp*a[z];
                        }
                        else if (x!=y && y==z){
                            int temp= (int) comb(a[y],2);
                            res+=temp*a[x];
                        }
                        else {
                            res+=a[x]*a[y]*a[z];
                        }
                    }
                }
            }
        }
        return  (int)(res%(Math.pow(10,9)+7));
    }

    public static long comb(int m,int n){//求阶乘方法
        if(n==0)
        return 1;
        if (n==1)
            return m;
        if(n>m/2)
            return comb(m,m-n);
        if(n>1)
            return comb(m-1,n-1)+comb(m-1,n);

        return -1;//通过编译需要，数字无实际意义
    }
}
