public class Leetcode907_3 {
    public int sumSubarrayMins(int[] A) {//测试大数组不超时，提交却超时，无语！
        long all=0;
        for (int i=0;i<A.length;++i){
            int min=30000;
            for (int j=i;j<A.length;++j){
                min=Math.min(min,A[j]);
                all+=min;
            }
        }
        return (int) (all%(Math.pow(10,9)+7));
    }
//    long all=0;
//    int[] temp=new int[A.length];
//        for (int i=0;i<A.length;++i){
//        for (int j=0;j<A.length-i;++j){
//            if (i!=0){
//                temp[j]=Math.min(A[j+i],temp[j]);
//            }
//            else if (i==0) {
//                temp[j] = A[j + i];
//            }
//            all+=temp[j];
//        }
//    }
//        return (int) (all%(Math.pow(10,9)+7));


//    long all=0;
//    int time;
//    int[] temp=new int[A.length];
//        for (int i=0;i<A.length;++i){
//        time=A.length-i;
//        for (int j=0;j<time;++j){
//            if (i==0){
//                temp[j] = A[j + i];
//            }
//            temp[j]=Math.min(A[j+i],temp[j]);
//            all+=temp[j];
//        }
//    }
//        return (int) (all%(Math.pow(10,9)+7));
}
