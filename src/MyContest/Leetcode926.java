public class Leetcode926 {
    public static  int minFlipsMonoIncr(String S) {
        int r0 = 0, r1 = 0, l1 = 0, l0 = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                r0++;
            } else {
                r1++;
            }
        }

        int res = r0;

        for (int j = 0; j < S.length(); j++) {
            if (S.charAt(j) == '0') {
                r0--;
                l0++;
            } else {
                r1--;
                l1++;
            }
            res = Math.min(l1 + r0, res);//当前位置之后的0数目+当前位置之前的1数目之和的最小值
        }

        return res;


    }
}
