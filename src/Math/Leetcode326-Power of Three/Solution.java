class Solution {//3���ݵ��ص㣺���һ������N��3���ݣ���ô������Լ������3���ݡ���ô����һ���Ƕȣ����nС��N����N��Լ������ô��һ����3����
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