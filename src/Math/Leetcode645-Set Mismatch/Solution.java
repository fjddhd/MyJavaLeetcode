public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] asist=new int[nums.length+1],result=new int[2];
        int lost=0,repeat=0;
        for (int i=0;i<nums.length;++i){
            asist[nums[i]]++;
        }
        for (int i=1;i<asist.length;++i) {
            if (asist[i] == 0)
                lost = i;
            if (asist[i] == 2)
                repeat=i;
        }
        result[0]=repeat;
        result[1]=lost;
        return result;
    }
}
