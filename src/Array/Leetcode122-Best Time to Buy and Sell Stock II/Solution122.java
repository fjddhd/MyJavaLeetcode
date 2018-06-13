public class Solution122 {
    public int maxProfit(int[] prices) {
        int length=prices.length,profit=0;
        for (int i=1;i<length;++i){
            if (prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;

    }
}
