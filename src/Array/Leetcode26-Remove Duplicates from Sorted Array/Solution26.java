public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int length=nums.length,mark=0;
        if (length==0)
            return 0;
        for(int i=0;i<=length-1-mark;++i){
            if (nums[i]==nums[i+1]) {
                removeElement(nums, i);
                mark++;
            }

        }
        return nums.length-mark;
    }


    public void removeElement(int[] nums,int index){
        int length=nums.length;
        for (int i=index;i<length-1;++i){
            nums[i]=nums[i+1];
        }

//        for (int i=0;i<nums.length;++i)
//            System.out.print(nums[i]);
//        System.out.println();
    }


}
