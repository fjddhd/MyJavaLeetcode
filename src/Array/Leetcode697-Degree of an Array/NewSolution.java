public class NewSolution {//该题为了不超时必须以空间换时间，略坑
    public int findShortestSubArray(int[] nums){
        int[] first=new int[50001];//标记最初出现位置
        int[] frequency=new int[50001];
        int MinLength=50000,MaxFrequency=0,CurrentLength;
        for (int i=1;i<nums.length+1;++i){
            frequency[nums[i-1]]++;
            if (first[nums[i-1]]==0) {
                first[nums[i-1]] = i;
            }
            else {
                CurrentLength=i-first[nums[i-1]]+1;
                if (frequency[nums[i-1]]>MaxFrequency){
                    MaxFrequency=frequency[nums[i-1]];
                    MinLength=CurrentLength;//优先满足频率超过之前最大频率的
                }
                else if (frequency[nums[i-1]]==MaxFrequency){
                    MinLength=Math.min(CurrentLength,MinLength);
                }
            }
        }
        if (MaxFrequency==0)//未出现过重复元素，只要出现过重复元素MaxFrequency就不为0
            return 1;
        return MinLength;
    }
}
