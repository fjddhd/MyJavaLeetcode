import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Leetcode974 {
//    public int subarraysDivByK(int[] A, int K) {//超时，平方时间复杂度
//        int count=0;
//        for(int i=0;i<A.length;++i){
//            int first=A[i];
//            if(first%K==0){
//                count++;
//            }
//            for(int k=i+1;k<A.length;++k){
//                first+=A[k];
//                if(first%K==0){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    public static int subarraysDivByK(int[] A, int K) {//不成功
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        int sum=0,count=0;
        for (int i=0;i<A.length;++i){
            sum+=A[i];
            int suml=sum%K;

            if (hm.containsKey(suml)){
                hm.put(suml,hm.get(suml)+1);
            }
            else if (!hm.containsKey(suml)){
                hm.put(suml,1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> it=hm.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer, Integer> entry=it.next();
            int value=entry.getValue();
            if (value>1){
                count+=(value-1)*value/2;
            }
        }
        return count;
    }
}
