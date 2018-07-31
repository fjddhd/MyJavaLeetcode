/**
 * 该题本是一道竞赛套路题
 * 先手至少平手
 * 不过题目没有设立平手
 * 所以先手一定赢*
 * */
class Solution {
    public static int[][] assit;
    public static int[] p;
    public boolean stoneGame(int[] piles) {
        int len=piles.length;
        assit=new int[len][len];
        p=piles;
        return dp(0,p.length-1)>0;
    }
    public int dp(int lo,int hi){
        if(lo==hi)
            return 0;
        if(assit[lo][hi]!=0)
            return assit[lo][hi];
        int res=0;
        if((lo+hi-1)%2==0)//alex取
            res=Math.max(dp(lo+1,hi)+p[lo],dp(lo,hi-1)+p[hi]);
        else//lee取
            res=Math.min(dp(lo+1,hi)-p[lo],dp(lo,hi-1)-p[hi]);
        assit[lo][hi]=res;
        return res;
    }
}
