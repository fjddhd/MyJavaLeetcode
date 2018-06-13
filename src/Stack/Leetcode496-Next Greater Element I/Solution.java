public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int[] result=new int[len1];
        for (int i=0;i<len1;++i){
            int temp=nums1[i],index=0,needToAdd=-1;
            for (int j=0;j<nums2.length;++j){
                if (nums2[j]==temp){
                    index=j;
                    break;
                }
            }
            for (int j=index;j<nums2.length;++j){
                if (nums2[j]>temp) {
                    needToAdd = nums2[j];
                    break;
                }
            }
            result[i]=needToAdd;
        }
        return result;
    }
}
