import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode935 {
    public int knightDialer(int N) {
        int mod = 1000000007;
        N--;
        long[] dp = new long[10];
        Arrays.fill(dp, 1);
        for (int i = 0; i < N; i++) {
            long[] ndp = new long[10];
            ndp[0] = dp[4] + dp[6];
            ndp[1] = dp[6] + dp[8];
            ndp[2] = dp[7] + dp[9];
            ndp[3] = dp[4] + dp[8];
            ndp[4] = dp[3] + dp[9] + dp[0];
            ndp[6] = dp[1] + dp[7] + dp[0];
            ndp[8] = dp[1] + dp[3];
            ndp[7] = dp[2] + dp[6];
            ndp[9] = dp[2] + dp[4];
            for (int j = 0; j < 10; j++) ndp[j] %= mod;
            dp = ndp;
        }

        long ret = 0;
        for (int i = 0; i < 10; i++) {
            ret += dp[i];
        }
        return (int) (ret % mod);
    }


}
