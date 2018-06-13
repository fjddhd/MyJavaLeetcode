import java.util.ArrayList;

public class Solution628 {
    public int maximumProduct(int[] nums) {
        int length=nums.length,max=-9999,second=-9999,third=-9999,max_mark=-1,second_mark=-1,all_p_m=-1;
        for (int i=0;i<length;++i){
            if (nums[i]>max){
                max=nums[i];
                max_mark=i;
            }
        }
        for (int i=0;i<length;++i){
            if (i!=max_mark)
                if (nums[i]>second){
                second=nums[i];
                second_mark=i;
                }
        }
        for (int i=0;i<length;++i){
            if (i!=max_mark && i!=second_mark)
                if (nums[i]>third){
                third=nums[i];
                //暂不标记第三大正数的下标
                }
        }
        System.out.println("mark: "+max_mark+" "+second_mark);
        System.out.println(max+" "+second+" "+third);
        all_p_m=max*second*third;

        //两负一正,先选两个最小数
        int min=0,se_min=0,min_mark=-1;
        for (int i=0;i<length;++i){
            if (nums[i]<min && i!=max_mark) {
                min = nums[i];
                min_mark = i;
            }
        }
        for (int i=0;i<length;++i){
            if (nums[i]<se_min && i!=max_mark && i!=min_mark){
                se_min=nums[i];
            }
        }
        System.out.println("min&semin  "+min_mark+"  "+max_mark+"  "+min+"  "+se_min);
        int all_m_m=min*se_min*max;
        if (all_m_m>all_p_m)
            return all_m_m;
        else
            return all_p_m;
        }
}
