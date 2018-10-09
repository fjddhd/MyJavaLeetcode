import java.util.ArrayList;

public class Leetcode918 {
    public static int maxSubarraySumCircular(int[] A) {//超时
        ArrayList<Integer> al=new ArrayList();
        for (int i=0;i<A.length;++i){
            al.add(A[i]);
        }
        for (int i=0;i<A.length;++i){
            al.add(A[i]);
        }
        int res=A[0],resOnce=A[0],count=1,lastPlusIndex=0;
        for(int i=1;i<al.size();++i){

            if(resOnce+al.get(i)>al.get(i) && count<A.length){
                resOnce=resOnce+al.get(i);
                count++;
            }
            else{
                i=lastPlusIndex;//这个是关键，回到上一个正数
                resOnce=al.get(i);
                count=1;
            }
            res=Math.max(res,resOnce);
            if (al.get(i)>0){
                lastPlusIndex=i;
            }
        }
        return res;
    }
//    public int maxSubarraySumCircular(int[] A) {//超时
//        int max1=0;
//        for (int i=0;i<A.length;++i){
//            int max2=A[i];
//            int sum=0;
//            for (int j=0;j<A.length;++j){
//                sum+=A[(i+j)%A.length];
//                max2=Math.max(max2,sum);
//            }
//            max1=Math.max(max1,max2);
//        }
//        return max1;
//    }
}
