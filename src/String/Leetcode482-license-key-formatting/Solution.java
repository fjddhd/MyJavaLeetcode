public class Solution {
    public static String licenseKeyFormatting(String S, int K) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<S.length();++i){
            if (S.charAt(i)=='-'){
                continue;
            }else if (S.charAt(i)<='z' && S.charAt(i)>='a'){
                sb.append((char)(S.charAt(i)-32));
            }else {
                sb.append(S.charAt(i));
            }
        }
        int first=sb.length()%K;
        StringBuilder res=new StringBuilder();
        int m;
        for (m=0;m<first;++m){
            res.append(sb.charAt(m));
        }
        if (m!=0 && S.length()>K) {
            res.append('-');
        }
        while (m<sb.length()){
            for (int i=0;i<K;++i){
                res.append(sb.charAt(m++));
            }
            if (m<sb.length()) {
                res.append('-');
            }
        }
        return res.toString();
    }
}
