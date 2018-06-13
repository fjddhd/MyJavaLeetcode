public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1=nums1.length,length2=nums2.length,i=0,j=0,count=0,temp=0,jishu=0,oushu1=0,oushu2=0;
        if((length1+length2)%2!=0){
            while(true){
                if (i<length1 && j<length2) {
                    if (nums1[i] < nums2[j]) {
                        temp = nums1[i];
                        i++;
                    } else {
                        temp = nums2[j];
                        j++;
                    }
                }
                else if (i<length1 && j>=length2){
                    temp = nums1[i];
                    i++;
                }
                else if (i>=length1 && j<length2){
                    temp = nums2[j];
                    j++;
                }
                count++;
                if (count==(length1+length2)/2+1){
                    jishu=temp;
                    break;
                }

            }
            return (double) jishu;
        }
        else {
            while (true){
                if (i<length1 && j<length2) {
                    if (nums1[i] < nums2[j]) {
                        temp = nums1[i];
                        i++;
                    } else {
                        temp = nums2[j];
                        j++;
                    }
                }
                else if (i<length1 && j>=length2){
                    temp = nums1[i];
                    i++;
                }
                else if (i>=length1 && j<length2){
                    temp = nums2[j];
                    j++;
                }
                count++;
                if (count==(length1+length2)/2){
                    oushu1=temp;
                }
                if (count==(length1+length2)/2+1){
                    oushu2=temp;
                    break;
                }
            }
            return (double) (oushu1+oushu2)/2;
        }
    }
}
