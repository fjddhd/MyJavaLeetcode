import java.util.Arrays;

public class test {
    public static void main(String[] ags){
        int[] a=new int[]{1,2,4,5,3,6,7};
        int[] b=new int[]{4,5,2,6,7,3,1};
        Leetcode889n s=new Leetcode889n();
        s.constructFromPrePost(a,b);
    }
}
