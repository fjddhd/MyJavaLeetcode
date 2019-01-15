import java.util.Arrays;

public class Leetcode973 {
    public static int[][] kClosest(int[][] points, int K) {
        int[][] res=new int[K][2];

        int[] pointojld=new int[points.length];
        int[] orderedpointojld=new int[points.length];
        for (int i=0;i<points.length;++i){
            pointojld[i]=points[i][0]*points[i][0]+points[i][1]*points[i][1];
            orderedpointojld[i]=points[i][0]*points[i][0]+points[i][1]*points[i][1];
        }
        Arrays.sort(orderedpointojld);

        for (int m=0;m<K;++m) {
            for (int i=0;i<pointojld.length;++i){
                if (pointojld[i]==orderedpointojld[m]){
                    res[m]=points[i];
                    break;
                }
            }
        }
        return res;
    }
}
