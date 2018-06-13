class Solution {
    public boolean isPowerOfFour(int num) {
        if(num==0)
            return false;
        String s=Integer.toBinaryString(num);
        char[] c=s.toCharArray();
        if(c.length==2 || c.length%2==0)
            return false;
        for(int i=1;i<c.length;++i){
            if(c[i]=='1')
                return false;
        }
        return true;
    }
}