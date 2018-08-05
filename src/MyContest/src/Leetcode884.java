public class Leetcode884 {//超出空间限制，不对！最好不要记录解码结果，只用count和定位K
    public String decodeAtIndex(String S, int K) {
        StringBuilder sb=new StringBuilder();
        int needToBreak=0;
        for (int i=0;i<S.length();++i){
            if (needToBreak==1)
                break;
            if (S.charAt(i)>=65){//字母
                sb.append(S.charAt(i));
            }
            else {//数字
                StringBuilder temp=new StringBuilder(sb);
                for (int j=0;j<(S.charAt(i)-'0'-1);++j){
                    sb.append(temp);
                    if (sb.length()>=K) {
                        needToBreak=1;
                        break;
                    }
                }
            }
        }
        return sb.substring(K-1,K);
    }
}
