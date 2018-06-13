public class Solution747 {
    public int dominantIndex(int[] nums) {
        int length=nums.length,max=nums[0],max_index=0,mark=0;
        if(length==1)
            return 0;
        for(int i=1;i<length;++i){
            if(nums[i]>max){
                max=nums[i];
                max_index=i;
            }
        }
        System.out.println(max+"  "+max_index);

        for(int i=0;i<length;++i){
            if(nums[i]==0)
                continue;
            if(i!=max_index){
                if(nums[max_index]/nums[i]<2)
                    mark=-1;
            }
        }
        if(mark!=-1)
            return max_index;
        else
            return -1;


    }
}
