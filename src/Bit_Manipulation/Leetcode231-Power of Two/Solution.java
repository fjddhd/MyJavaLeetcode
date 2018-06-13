class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        while(true){
            if(n>>1==0){
                break;
            }
            else{
                if(n%2==1)
                    return false;
            }
            n=n>>1;
        }
        return true;
    }
}