import java.util.ArrayList;
import java.util.Arrays;

public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int length_r=nums.length,length_all=0;
        ArrayList<Integer> a=new ArrayList<Integer>();
        for (int i=0;i<length_r;++i){
            length_all+=nums[i].length;
        }
        if (length_all<r*c){
            return nums;
        }else {
            int[] first=nums[0];
            for (int i = 1; i < length_r; ++i) {
                first=concat(first,nums[i]);
            }
            int first_length=first.length,r_st=0,c_st=0;
            int[][] result=new int[r][c];
            for (int i=0;i<first_length;++i){
                result[r_st][c_st]=first[i];
                if ((i+1)%c==0){
                    r_st++;
                    c_st=0;
                    continue;
                }
                c_st++;
            }
            return result;
        }

    }
    public static int[] concat(int[] first, int[] second) {
        int[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }
}
