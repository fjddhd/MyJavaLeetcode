public class Solution {
    public int hammingWeight(int n) {
        int sum=1;
        if(n==0)
            return 0;
        while(n>1){
            if((n&1)==1)//用“与”操作取余
                sum++;
            n=n>>1;
        }
        return sum;
    }
}
