import java.util.ArrayList;

public class Solution {//该法不可用
    public static String[] findWords(String[] words) {
        ArrayList<Character> al1=new ArrayList<>();
        al1.add('q');al1.add('w');al1.add('e');al1.add('r');al1.add('t');al1.add('y');
        al1.add('u');al1.add('i');al1.add('o');al1.add('p');
        for (int i=0;i<al1.size();++i){
            al1.add(Character.toUpperCase(al1.get(i)));
        }
        ArrayList<Character> al2=new ArrayList<>();
        al2.add('a');al2.add('s');al2.add('d');al2.add('f');al2.add('g');al2.add('h');
        al2.add('j');al2.add('k');al2.add('l');
        for (int i=0;i<al1.size();++i){
            al2.add(Character.toUpperCase(al2.get(i)));
        }
        ArrayList<Character> al3=new ArrayList<>();
        al3.add('z');al3.add('x');al3.add('c');al3.add('v');al3.add('b');al3.add('n');
        al3.add('m');
        for (int i=0;i<al1.size();++i){
            al3.add(Character.toUpperCase(al3.get(i)));
        }
        ArrayList<String> res=new ArrayList<>();
        for (int i=0;i<words.length;++i){
            int notThisLine=0;
            String s=words[i];
            ArrayList line;
            if (al1.contains(s.charAt(0)))
                line=al1;
            else if (al2.contains(s.charAt(0)))
                line=al2;
            else
                line=al3;
            for (int j=1;j<s.length();++j){
                if (!line.contains(s.charAt(j))) {
                    notThisLine = 1;
                    break;
                }
            }
            if (notThisLine==1){
                break;
            }
            else {
                res.add(s);
            }
        }
        String[] result=res.toArray(new String[res.size()]);
        return result;
    }
}
