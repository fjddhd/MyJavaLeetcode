public class Leetcode915 {
//    public static int partitionDisjoint(int[] A) {
//        int len=A.length;
//        int right=len-1;
//        int lmax=A[0],rmin=A[right];
//        if(lmax==rmin)
//            return right;
//        while (lmax<rmin){
//            right--;
//            rmin = Math.min(rmin, A[right]);
//            for (int i=0;i<right;++i) {
//                lmax=Math.max(lmax,A[i]);
//            }
//        }
//        right++;
//        return right;
//    }
public static int partitionDisjoint(int[] a) {
    int n = a.length;
    int[] pre = new int[n+1];
    for(int i = 0;i < n;i++){
        pre[i+1] = Math.max(pre[i], a[i]);
    }
    int[] suf = new int[n+1];
    suf[n] = 999999999;
    for(int i = n-1;i >= 0;i--){
        suf[i] = Math.min(suf[i+1], a[i]);
    }
    for(int i = 1;i < n;i++){
        if(pre[i] <= suf[i]){
            return i;
        }
    }
    throw new RuntimeException();//毕竟一定有解，就不写多余的return了
}
}
