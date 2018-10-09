import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode916 {
//    public static List<String> wordSubsets(String[] A, String[] B) {
//        List<String> res=new ArrayList<>();
//        for (int i=0;i<A.length;++i){
//            int mark=0;
//            char[] Ai=A[i].toCharArray();
//            ArrayList<Character> needToCheck=new ArrayList<>();
//            for (int j=0;j<Ai.length;++j){
//                needToCheck.add(Ai[j]);
//            }
//            for (int j=0;j<B.length;++j){
//                char[] b=B[j].toCharArray();
//                int mark1=0;
//                ArrayList<Character> needToCheck1=new ArrayList<>(needToCheck);
//                for (int k=0;k<b.length;++k){
//                    if (!needToCheck1.contains(b[k])){
//                        break;
//                    }
//                    if (k!=b.length-1){//防止出现b中有重复的字母
//                        needToCheck1.remove(needToCheck1.indexOf(b[k]));
//                    } else if (needToCheck1.contains(b[k]) && k==b.length-1){
//                        mark1=1;
//                    }
//                }
//                if (mark1==1)
//                    mark++;
//                else
//                    break;//如果这个b都不包括那就不用测试下个b了，直接换needtocheck单词
//            }
//            if (mark==B.length){
//                res.add(A[i]);
//            }
//        }
//        return res;
//    }
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] gf = new int[26];
        for(String b : B){
            int[] f = new int[26];
            for(char c : b.toCharArray()){
                f[c-'a']++;
            }
            for(int i = 0;i < 26;i++){
                gf[i] = Math.max(gf[i], f[i]);
            }
        }
        List<String> ret = new ArrayList<>();
        outer:
        for(String a : A){
            int[] f = new int[26];
            for(char c : a.toCharArray()){
                f[c-'a']++;
            }
            for(int i = 0;i < 26;i++){
                if(f[i] < gf[i])continue outer;
            }
            ret.add(a);
        }
        return ret;

    }
}
