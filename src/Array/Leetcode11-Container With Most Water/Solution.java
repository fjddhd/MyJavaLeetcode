public class Solution {
    public int maxArea(int[] height) {
        int len=height.length,max_volum=Math.min(height[0],height[len-1])*(len-1),i=0,j=len-1;
        while (i!=j){
            max_volum=Math.max(max_volum,Math.min(height[i],height[j])*(j-i));
            if (height[i]<=height[j])
                i++;
            else
                j--;
        }
        return max_volum;
    }
}
