public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int len=numbers.length,i=0,j=len-1;
        int[] result=new int[2];
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                result[0]=i+1;
                result[1]=j+1;
                break;
            }
            if(sum>target){
                    j--;
            }
            else
                i++;
        }
        return result;
    }
}
