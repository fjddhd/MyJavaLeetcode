public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int mark=0,count=0;
        int[] f=new int[flowerbed.length+2];
        f[0]=0;f[f.length-1]=0;
        for (int i=1;i<f.length-1;++i){
            f[i]=flowerbed[i-1];
        }
        for(int i=0;i<f.length;++i){
            if (f[i]==1 && mark!=0){
                count+=(mark-1)/2;
                mark=0;
            }
            else if (f[i]==1 && mark==0)
                continue;
            if (f[i]==0)
                mark++;
        }
        count+=(mark-1)/2;
        System.out.println(count);
        if (count>=n)
            return true;
        else
            return false;
    }
}
