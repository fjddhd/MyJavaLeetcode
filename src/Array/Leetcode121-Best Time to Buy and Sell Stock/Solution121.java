public class Solution121 {
    public int maxProfit(int[] prices) {
        int length=prices.length,lowest_price=0,profit=0;
        if (length!=0){
            lowest_price=prices[0];
            profit=0;
        }
        for (int i=0;i<length;++i){
            if (prices[i]<lowest_price){
                lowest_price=prices[i];
            }
            if (prices[i]-lowest_price>profit){
                profit=prices[i]-lowest_price;
            }
        }
        return profit;
    }
}
