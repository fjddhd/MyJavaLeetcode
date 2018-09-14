public class Solution {
    public int arrangeCoins(int n) {
        int start = 0,mid,end = n;
        while (start <= end){
            mid = (start + end) >> 1;//右移
            if (0.5 * mid * mid + 0.5 * mid<= n){//注意不要使用(mid*(mid+1))/2 ，不然当mid接近int最大值时会溢出错误
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start - 1;
    }
}
