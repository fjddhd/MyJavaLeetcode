import java.util.Arrays;

public class Solution697 {
        public int findShortestSubArray(int[] nums) {
            int length=nums.length,max_element_index,trim_num=0;
            int[] maxs=new int[length];
                for (int i = 0; i < length; ++i) {
                    int mark = 0;
                    for (int j = 1; j < length; ++j) {
                        if (nums[i] == nums[j])
                            mark++;
                    }
                    maxs[i] = mark;
                }
                System.out.println(Arrays.toString(maxs));

                max_element_index = findMAX_DU(maxs, length);
                for (int i = 0; i < length; ++i) {
                    if (nums[i] != nums[max_element_index]) {
                        trim_num++;
//                    System.out.println(trim_num);
                    } else
                        break;

                }
                for (int i = length - 1; i >= 0; i--) {
                    if (nums[i] != nums[max_element_index]) {
                        trim_num++;
//                    System.out.println(trim_num);
                    } else
                        break;
                }
                return length - trim_num;


        }

        public int findMAX_DU(int[] maxs,int length){
            int max=maxs[0],index=0;
            for(int i=1;i<length;++i){
                if(maxs[i]>maxs[i-1] && maxs[i]>max) {
                    max = maxs[i];
                    index = i;
                }
            }
            System.out.println("max:"+max);
            System.out.println("index:"+index);
            return index;
        }
    }

