import java.util.Arrays;

public class Leetcode189 {
    public static void main(String[] args){
        Solution189 S=new Solution189();
        int [] test=new int[]{1,2,3};
        int test_k=4;
        S.rotate(test,test_k);
        System.out.println(Arrays.toString(test));
    }
}
