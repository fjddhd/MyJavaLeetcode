import java.util.ArrayList;
import java.util.Arrays;

public class Solution283 {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        for (int i=0;i<length;++i){
            while (nums[i]==0 && !isFinished(i,nums)){
                for (int j=i;j<length-1;++j){
                    nums[j]=nums[j+1];
                }
                System.out.println(Arrays.toString(nums));
                nums[length-1]=0;
            }
        }
    }

    public boolean isFinished(int i,int[] nums){
        int length = nums.length,mark=0;
        for (int k=i; k<length; ++k){
            if (nums[k]!=0)
                mark=1;
        }
        if (mark==0)
            return true;
        else
            return false;
    }
}
