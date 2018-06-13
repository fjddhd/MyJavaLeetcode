public class Solution414 {
    public int thirdMax(int[] nums) {
        int len=nums.length,mark=0;
        double default_min=-21474836480.0;
        double[] temp=new double[3];
        for(int i=0;i<3;++i){
            temp[i]=default_min-i;
        }
        for(int i=0;i<len;++i){
            if(nums[i]>temp[2] && nums[i]<temp[1]){
                temp[2]=nums[i];
                continue;
            }
            else if(nums[i]>temp[1] && nums[i]<temp[0]){
                temp[2]=temp[1];
                temp[1]=nums[i];
                continue;
            }
            else if(nums[i]>temp[0]){
                temp[2]=temp[1];
                temp[1]=temp[0];
                temp[0]=nums[i];
                continue;
            }
            else
                continue;
        }
        if(temp[2]>default_min){
            return (int) temp[2];}
        else{
            return (int) temp[0];}
    }
}
