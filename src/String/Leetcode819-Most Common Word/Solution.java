import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        int max=0;
        String par=paragraph.toLowerCase();
        String result=new String();
        ArrayList<String> ban=new ArrayList<>();
        ArrayList<Character> symbol=new ArrayList<>();
        symbol.add('!');symbol.add('?');symbol.add(',');symbol.add(';');symbol.add('.');symbol.add('\'');
        for (int i=0;i<banned.length;++i)
            ban.add(banned[i]);
        par.toLowerCase();
        ArrayList<String> als=new ArrayList<>();
        ArrayList<Integer> ali=new ArrayList<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<par.length();++i){
            if (i+1==par.length()){
                if(par.charAt(i)!=' ' && !symbol.contains(par.charAt(i)))
                    sb.append(par.charAt(i));
                if (als.contains(sb.toString())) {
                    ali.set(als.indexOf(sb.toString()), ali.get(als.indexOf(sb.toString())) + 1);
                } else {
                    ali.add(1);
                    als.add(sb.toString());
                }
            }
            if (symbol.contains(par.charAt(i)))
                continue;
            if(par.charAt(i)!=' ')
                sb.append(par.charAt(i));
            else {
                if (als.contains(sb.toString())) {
                    ali.set(als.indexOf(sb.toString()), ali.get(als.indexOf(sb.toString())) + 1);
                } else {
                    als.add(sb.toString());
                    ali.add(1);
                }
                sb=new StringBuffer();
            }

        }
        System.out.println("次数  "+Arrays.toString(ali.toArray()));
        System.out.println("string  "+Arrays.toString(als.toArray()));
        for (int i=0;i<ali.size();++i){
            if (max<ali.get(i) && !ban.contains(als.get(i))){
                max=ali.get(i);
                result=als.get(i);
            }
        }
        return result;
    }
}
