import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static ArrayList<Character> Cap=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        List<String> al=new ArrayList<>();
        List<String> res=new ArrayList<>();
        for (int i=0;i<26;++i)
            Cap.add((char) ('a'+i));
        res=num(digits,0,al);
        return res;

    }
    public List<String> num(String s,int term,List<String> L){
        if (term==s.length())
            return L;
        if (L.size()==0) {
            switch (s.charAt(term)) {
                case '2':
                    for (int i = 0; i < 3; ++i) {
                        L.add(String.valueOf(Cap.get(i)));
                    }
                    break;
                case '3':
                    for (int i = 3; i < 6; ++i) {
                        L.add(String.valueOf(Cap.get(i)));
                    }
                    break;
                case '4':
                    for (int i = 6; i < 9; ++i) {
                        L.add(String.valueOf(Cap.get(i)));
                    }
                    break;
                case '5':
                    for (int i = 9; i < 12; ++i) {
                        L.add(String.valueOf(Cap.get(i)));
                    }
                    break;
                case '6':
                    for (int i = 12; i < 15; ++i) {
                        L.add(String.valueOf(Cap.get(i)));
                    }
                    break;
                case '7':
                    for (int i = 15; i < 19; ++i) {
                        L.add(String.valueOf(Cap.get(i)));
                    }
                    break;
                case '8':
                    for (int i = 19; i < 22; ++i) {
                        L.add(String.valueOf(Cap.get(i)));
                    }
                    break;
                case '9':
                    for (int i = 22; i < 26; ++i) {
                        L.add(String.valueOf(Cap.get(i)));
                    }
                    break;
            }
            return num(s,term+1,L);
        }
        else {
            List<String> newL=new ArrayList<>();
            for (int k=0;k<L.size();++k){
                switch (s.charAt(term)) {
                    case '2':
                        for (int i = 0; i < 3; ++i) {
                            StringBuffer sb = new StringBuffer(L.get(k));
                            sb.append(Cap.get(i));
                            newL.add(sb.toString());
                        }
                        break;
                    case '3':
                        for (int i = 3; i < 6; ++i) {
                            StringBuffer sb = new StringBuffer(L.get(k));
                            sb.append(Cap.get(i));
                            newL.add(sb.toString());
                        }
                        break;
                    case '4':
                        for (int i = 6; i < 9; ++i) {
                            StringBuffer sb = new StringBuffer(L.get(k));
                            sb.append(Cap.get(i));
                            newL.add(sb.toString());
                        }
                        break;
                    case '5':
                        for (int i = 9; i < 12; ++i) {
                            StringBuffer sb = new StringBuffer(L.get(k));
                            sb.append(Cap.get(i));
                            newL.add(sb.toString());
                        }
                        break;
                    case '6':
                        for (int i = 12; i < 15; ++i) {
                            StringBuffer sb = new StringBuffer(L.get(k));
                            sb.append(Cap.get(i));
                            newL.add(sb.toString());
                        }
                        break;
                    case '7':
                        for (int i = 15; i < 19; ++i) {
                            StringBuffer sb = new StringBuffer(L.get(k));
                            sb.append(Cap.get(i));
                            newL.add(sb.toString());
                        }
                        break;
                    case '8':
                        for (int i = 19; i < 22; ++i) {
                            StringBuffer sb = new StringBuffer(L.get(k));
                            sb.append(Cap.get(i));
                            newL.add(sb.toString());
                        }
                        break;
                    case '9':
                        for (int i = 22; i < 26; ++i) {
                            StringBuffer sb = new StringBuffer(L.get(k));
                            sb.append(Cap.get(i));
                            newL.add(sb.toString());
                        }
                        break;
                }//end switch
            }//end for
            return num(s,term+1,newL);
        }//end else
    }//end this method
}
