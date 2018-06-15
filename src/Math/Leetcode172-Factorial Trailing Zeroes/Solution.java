/**
* 分析阶乘表，发现规律：0~4为0,5~9为1,10~14为2……中间跳过5,11,17，……，5+6（n-1）
 * * */
public class Solution {
    public int trailingZeroes(int n) {
        int re=n/5,add=re/5;
        while (add/5>=1){
            re+=add;
            add=add/5;
        }
        re+=add;
        return re;
    }
}
