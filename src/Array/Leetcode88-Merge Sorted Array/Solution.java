public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1=nums1.length,cur1=0,j=0,mark=0;
        while(j<n){
            if(nums1[cur1]>=nums2[j]){
                int temp=nums1[cur1];
                nums1[cur1]=nums2[j];
                j++;
                for(int i=len1-1;i>=cur1+2;i--)
                    nums1[i]=nums1[i-1];
                nums1[cur1+1]=temp;
                cur1++;
            }
            else if(mark>=m){
                nums1[cur1++]=nums2[j++];
            }
            else{
                cur1++;mark++;
            }
        }
    }
}
