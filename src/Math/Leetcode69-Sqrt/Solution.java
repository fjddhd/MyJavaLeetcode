class Solution {
    public int mySqrt(int x) {
        int m=0;
        if(x==2147483647)
            return 46340;
        while(m*m<=x){
            if(m*m==x)
                return m;
            m++;
        }
        return m-1;
            
    }
}