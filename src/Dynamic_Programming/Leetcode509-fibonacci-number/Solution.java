class Solution {
    public int fib(int N) {
        int a=0,b=1,c=a+b;
        if(N==0)
            return a;
        if(N==1)
            return b;
        for(int i=2;i<N;++i){
            int temp=c;
            c=c+b;
            a=b;
            b=temp;
        }
        return c;
    }
}