import java.util.ArrayList;
import java.util.HashMap;

public class Solution2 {
    public static String[] findWords(String[] words) {
        HashMap<Character,Integer> hm1=new HashMap<>();
        hm1.put('q',1);hm1.put('w',1);hm1.put('e',1);hm1.put('r',1);hm1.put('t',1);hm1.put('y',1);
        hm1.put('u',1);hm1.put('i',1);hm1.put('o',1);hm1.put('p',1);
        hm1.put('Q',1);hm1.put('W',1);hm1.put('E',1);hm1.put('R',1);hm1.put('T',1);hm1.put('Y',1);
        hm1.put('U',1);hm1.put('I',1);hm1.put('O',1);hm1.put('P',1);

        HashMap<Character,Integer> hm2=new HashMap<>();
        hm2.put('A',1);hm2.put('S',1);hm2.put('D',1);hm2.put('F',1);hm2.put('G',1);hm2.put('H',1);
        hm2.put('J',1);hm2.put('K',1);hm2.put('L',1);
        hm2.put('a',1);hm2.put('s',1);hm2.put('d',1);hm2.put('f',1);hm2.put('g',1);hm2.put('h',1);
        hm2.put('j',1);hm2.put('k',1);hm2.put('l',1);

        HashMap<Character,Integer> hm3=new HashMap<>();
        hm3.put('z',1);hm3.put('x',1);hm3.put('c',1);hm3.put('v',1);hm3.put('b',1);hm3.put('n',1);
        hm3.put('m',1);
        hm3.put('Z',1);hm3.put('X',1);hm3.put('C',1);hm3.put('V',1);hm3.put('B',1);hm3.put('N',1);
        hm3.put('M',1);

        ArrayList<String> res=new ArrayList<>();
        for (int i=0;i<words.length;++i){
            System.out.println("term "+i);
            int notThisLine=0;
            String s=words[i];
            HashMap line;
            if (hm1.containsKey(s.charAt(0)))
                line=hm1;
            else if (hm2.containsKey(s.charAt(0)))
                line=hm2;
            else
                line=hm3;
            for (int j=1;j<s.length();++j){
                if (!line.containsKey(s.charAt(j))) {
                    notThisLine = 1;
                    break;
                }
            }
            if (notThisLine==0){
                res.add(s);
            }
        }
        String[] result=res.toArray(new String[res.size()]);
        return result;
    }
}
