class Solution {//所有的完全平方数都可以被表示成奇数和1+3+5+7+9 ...。
    public boolean isPerfectSquare(int num) {
        int i = 1;
     while (num > 0) {
         num -= i;
         i += 2;
     }
     return num == 0;
    }
}