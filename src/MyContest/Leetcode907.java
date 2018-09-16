//题设
//1 <= A <= 30000
//1 <= A[i] <= 30000
public class Leetcode907 {//大数测试超时
    public static int sumSubarrayMins(int[] A) {
        long all=0,min;
        for (int i=1;i<=A.length;++i){//子数组长度
            for (int j=0;j<A.length-i+1;++j){//每个子数组起始位置
                min=30000;
                for (int k=0;k<i;++k){
                    int index=j+k;
                    min=Math.min(min,A[index]);
                }
//                System.out.println(min);
                all+=min;
            }
        }
        return (int) (all%(Math.pow(10,9)+7));
    }
}
