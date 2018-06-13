class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int sum=0,temp=x,num;
        while(temp>0){
            num=temp%10;
            sum=sum*10+num;
            temp/=10;
        }
        if(sum==x)
            return true;
        else
            return false;
        
    }
}