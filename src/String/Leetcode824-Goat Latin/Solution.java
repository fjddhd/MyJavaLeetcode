import java.util.ArrayList;

public class Solution {
    public String toGoatLatin(String S) {
        ArrayList<Character> al=new ArrayList<>();
        al.add('a');al.add('e');al.add('i');al.add('o');al.add('u');
        al.add('A');al.add('E');al.add('I');al.add('O');al.add('U');
        ArrayList<StringBuffer> als=new ArrayList<>();
        char mark=0;//初始值
        int mark_first=0;
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<S.length();++i){
            if (mark_first==0){//每个单词第一个字母
                if (al.contains(S.charAt(i))){
                    sb.append(S.charAt(i));
                    if (i==S.length()-1){
                        sb.append("ma");
                        als.add(sb);
                    }
                }
                else {
                    mark=S.charAt(i);
                    if (i==S.length()-1){
                        sb.append(mark);
                        sb.append("ma");
                        als.add(sb);
                    }
                }
                mark_first=1;
            }
            else {
                if (S.charAt(i)==' ' || i==S.length()-1){
                    if (i==S.length()-1)
                        sb.append(S.charAt(i));
                    if (mark!=0){
                        sb.append(mark);
                        mark=0;
                    }
                    sb.append("ma");
                    als.add(sb);
                    sb=new StringBuffer();
                    mark_first=0;
                }
                else {
                    sb.append(S.charAt(i));
                }
            }
        }
        for (int i=0;i<als.size();++i){
            StringBuffer temp_sb=als.get(i);
            for (int j=0;j<=i;++j)
                temp_sb.append('a');
            als.set(i,temp_sb);
        }
        StringBuffer sb_result=new StringBuffer();
        for (int i=0;i<als.size();++i){
            sb_result.append(als.get(i));
            if (i!=als.size()-1)
                sb_result.append(" ");
        }
        return sb_result.toString();
    }
}
