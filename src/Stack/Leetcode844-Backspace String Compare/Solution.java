public class Solution {
    public boolean backspaceCompare(String S, String T) {
        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        for (int i=0;i<S.length();++i){
            sb1.append(S.charAt(i));
            if (S.charAt(i)=='#'){
                int head=sb1.length()-2;
                if(head<0)
                    head=0;
                sb1=sb1.delete(head,sb1.length());//这个方法前面是闭区间，后面是开区间
            }
        }
        for (int i=0;i<T.length();++i){
            sb2.append(T.charAt(i));
            if (T.charAt(i)=='#'){
                int head=sb2.length()-2;
                if(head<0)
                    head=0;
                sb2=sb2.delete(head,sb2.length());
            }
        }
        if (sb1.toString().equals(sb2.toString()))
            return true;
        else
            return false;
    }
}
