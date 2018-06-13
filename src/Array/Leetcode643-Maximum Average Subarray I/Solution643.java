public class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        int length=nums.length;
        double result=-10001,all=0;
        if(length==0)
            return 0;
        if(length<=k){
            for(int i=0;i<length;++i){
                all+=nums[i];
            }
//            System.out.println(all);
            result=(double)all/length;
            return result;
        }
        else{
            for(int i=0;i<=length-k;++i){
                all=0;
                for(int j=0;j<k;++j){
                    all+=nums[i+j];
                }

                if(all>result)
                    result=all;
            }
//            System.out.println("hahaha"+result);
            return result/k;
        }

    }
}
