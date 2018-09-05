import java.util.Arrays;
import java.util.HashSet;

public class Leetcode898 {
    public int subarrayBitwiseORs(int[] A) {//大数组超时
        int term = A.length * (A.length + 1) / 2;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < term; ++i) {
            int[] a = new int[i+1];
            for (int j = 0; j + i < A.length; ++j) {
                a = Arrays.copyOfRange(A, j, j + i + 1);
                if (a.length == 1) {
                    hs.add(a[0]);
                } else {
                    int temp = a[0];
                    for (int k = 1; k < a.length; ++k) {
                        temp = temp | a[k];
                    }
                    hs.add(temp);
                }
            }
        }
        return hs.size();
    }
}
