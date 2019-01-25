class Solution {//3的幂的特点：如果一个整数N是3的幂，那么其所有约数都是3的幂。那么，换一个角度，如果n小于N且是N的约数，那么其一定是3的幂
    public boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        int max = (int) Math.pow(3, (int) (Math.log(0x7fffffff) / Math.log(3)));
        if(max%n==0)
            return true;
        else
            return false;
    }
}