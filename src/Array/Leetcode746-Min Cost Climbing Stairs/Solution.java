public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len=cost.length,cost_all=0,cost_all_1=0,cost_all_2=0;
        for (int i=2;i<=len;++i){
            cost_all=Math.min(cost[i-2]+cost_all_2,cost_all_1+cost[i-1]);
            cost_all_2=cost_all_1;
            cost_all_1=cost_all;
        }
        return cost_all;

    }
}
