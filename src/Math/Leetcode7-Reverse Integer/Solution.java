public class Solution {
    public int reverse(int x) {
        int res=0;
        while (x!=0){
            int temp=res*10+x%10;//这句完成后temo/10应该为res
            if (temp/10!=res)
                return 0;
            res=temp;
            x/=10;
        }
        return res;
    }
}
