public class Solution724 {
    public int pivotIndex(int[] nums) {
        int length=nums.length,i,max_front=0,max_back=0,mark=0;
        if(length!=0)
            max_front=nums[0];
        if (length<2)
            return -1;
        for (int k=1;k<length;++k){
            max_back+=nums[k];
        }
        System.out.println("back"+max_back);
        if (max_back==0)
            return 0;
        for (i=1;i<length-1;++i){
            System.out.println("hahahaha");
            if (max_back!=max_front) {
                max_front = 0;
                max_back = 0;
                for (int l = 0; l < i; ++l) {
                    max_front += nums[l];
                }
                for (int m = i + 1; m < length; ++m) {
                    max_back += nums[m];
                }
            }
            else {
                mark=1;
                break;
            }
        }
        if (mark==1){
            return i-1;
        }else {
            return -1;
        }
    }
}
