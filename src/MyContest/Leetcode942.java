public class Leetcode942 {
    public int[] diStringMatch(String S) {
        int N=S.length();
        int min=0,max=0;
        int[] res=new int[N+1];
        res[0]=0;
        for (int i=1;i<=N;++i){
            if (S.charAt(i-1)=='I'){
                res[i]=++max;
            }
            else {
                res[i]=--min;
            }
        }
        for (int i=0;i<=N;++i){
            res[i]-=min;
        }
        return res;
    }
}
