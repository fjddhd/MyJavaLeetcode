import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;

import java.util.Arrays;

public class Leetcode283 {
    public static void main(String[] args){
        int[] test=new int[]{0,0,1};
        Solution283 S=new Solution283();
        S.moveZeroes(test);
        System.out.println(Arrays.toString(test));
    }
}
