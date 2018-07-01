public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        for(int i=0;i<bills.length;++i){
            int temp=bills[i];
            if (temp==5)
                five++;
            else if (temp==10){
                ten++;
                if (five==0)
                    return false;
                else
                    five--;
            }
            else if (temp==20){
                if (five==0)
                    return false;
                else if (five!=0 && ten!=0){
                    ten--;
                    five--;
                }
                else if (ten==0 && five<3)
                    return false;
                else if (ten==0 && five>=0)
                    five-=3;
            }
        }
        return true;
    }
}
