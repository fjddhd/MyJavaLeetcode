public class Leetcode944 {//这个题的有序是递增有序
    public static int minDeletionSize(String[] A) {
        int N=A.length,n=A[0].length();
        StringBuilder[] aa=new StringBuilder[n];
        for (int i=0;i<n;++i){
            aa[i]=new StringBuilder();
        }
        for (int i=0;i<N;++i){
            for (int j=0;j<n;++j){
                aa[j].append(A[i].charAt(j));
            }
        }
        int countForOrdered=0;
        for (int i=0;i<n;++i){
            if (isOrdered(aa[i])){
                countForOrdered++;
            }
        }
        return n-countForOrdered;
    }
    public static boolean isOrdered(StringBuilder s){
//        if (s.charAt(1)>s.charAt(0)){
            for (int i=1;i<s.length();++i){
                if (s.charAt(i)<s.charAt(i-1))
                    return false;
            }
            return true;
//        }
//        else {
//            for (int i=1;i<s.length();++i){
//                if (s.charAt(i)>s.charAt(i-1))
//                    return false;
//            }
//            return true;
//        }
    }
}
