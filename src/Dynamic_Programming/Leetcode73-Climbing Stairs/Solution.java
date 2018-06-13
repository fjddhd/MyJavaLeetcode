class Solution {
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int[] assit=new int[n];
        assit[0]=1;
        assit[1]=2;
        for(int i=2;i<n;++i){
            assit[i]=assit[i-2]+assit[i-1];
        }
        return assit[n-1];
    }
}