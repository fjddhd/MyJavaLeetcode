public class Solution {
    public boolean detectCapitalUse(String word) {
        char[] ca=word.toCharArray();
        int len=ca.length,mark=0;
        if (len<=1)
            return true;
        if (Character.isLowerCase(ca[0])){
            for (int i=1;i<len;++i){
                if (Character.isUpperCase(ca[i]))
                    return false;
            }
        }else {
            if (Character.isLowerCase(ca[1]))
                mark=1;
            else
                mark=2;
            if (mark==1){
                for (int i=2;i<len;++i){
                    if (Character.isUpperCase(ca[i]))
                        return false;
                }
            }
            else{
                for (int i=2;i<len;++i){
                    if (Character.isLowerCase(ca[i]))
                        return false;
                }
            }
        }
        return true;
    }
}
