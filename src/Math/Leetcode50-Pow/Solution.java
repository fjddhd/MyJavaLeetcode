//二分pow(x,n) = pow(x,n/2)*pow(x,n-n/2)
public class Solution {
    public double myPow(double x, int n) {
        if(n==0)
            return 1.0;
        if(n<0)
            return 1.0/myPow(x,-n);
        double half = myPow(x,n>>1);
        if(n%2==0)
            return half*half;
        else
            return half*half*x;
    }
}
