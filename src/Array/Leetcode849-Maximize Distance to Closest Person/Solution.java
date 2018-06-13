public class Solution {
    public int maxDistToClosest(int[] seats) {
        int len=seats.length,mark_back=0,mark_front=0,max=0,last_one=0,isFindFistOne=0;
        for (int i=len-1;i>=0;--i){
            if (seats[i]==0) {
                mark_back++;
            }
            else {
                max=mark_back;
                last_one=i;
                break;
            }
        }
        for (int i=0;i<last_one;++i){
            if (seats[i]==0){
                if (isFindFistOne==0){
                    mark_front++;
                    max=Math.max(max,mark_front);
                }
                else {
                    mark_front++;
                    max= (int) Math.max(max,(mark_front+1)/2);
                }
            }
            else {
                isFindFistOne=1;
                mark_front=0;
            }
        }
        return max;
    }
}
