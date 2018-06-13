/*先全部逆转一遍
再把前k个逆转一遍
最后把最后面的元素逆转一遍
* */
public class Solution189 {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        if(k==0){
            return;
        }
        while(k>len){
            k=k-len;
        }
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }


    private void reverse(int[] nums,int index1,int index2){
        int temp,i=index1,j=index2;
        while(i<j){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
