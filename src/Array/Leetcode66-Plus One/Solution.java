public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length, needToAdd = 1;
        for (int i = 0; i < len; ++i) {
            if (needToAdd==0)
                break;
            if (digits[len - 1 - i] == 9) {
                needToAdd = 1;
            } else {
                needToAdd = 0;
            }
            digits[len - 1 - i] = (digits[len - 1 - i] + 1) % 10;
        }
        if (needToAdd == 1) {
            digits=new int[len+1];
            digits[0]=1;
            for (int i=1;i<len+1;++i){
                digits[i]=0;
            }
        }
        return digits;
    }
}
