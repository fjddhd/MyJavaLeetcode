public class Leetcode922 {
    public int[] sortArrayByParityII(int[] A) {
        int len=A.length,i=0,j=(len-1)%2==1?len-1:len-2;
        int needTo=0;
        while (i<len&&j>=0){
            if (needTo==0&&A[i]%2==0){
                i+=2;
            }
            else if (needTo==0&&A[i]%2==1){
                needTo=1;
            }
            if (needTo==1){
                if (A[j]%2==1){
                    j-=2;
                }
                else {
                    int temp=A[j];
                    A[j]=A[i];
                    A[i]=temp;
                    needTo=0;
                }
            }
        }
        return A;
    }
}
