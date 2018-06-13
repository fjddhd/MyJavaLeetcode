public class Solution717 {
    public boolean isOneBitCharacter(int[] bits) {
        int length=bits.length,i=0,mark=0;
        while(i<length){
            if(bits[i]==0){
                ++i;
                mark=1;
                if (i>length-1)
                    break;
            }
            if(bits[i]==1){
                i+=2;
                mark=2;
                if (i>length-1)
                    break;
            }
        }
        if(mark==1){
            return true;
        }
        else{
            return false;
        }
    }
}
