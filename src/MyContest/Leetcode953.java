import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Leetcode953 {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> hs= new HashMap<>();
        ArrayList<String> al1=new ArrayList();
        for (int i=0;i<26;++i){
            hs.put(order.charAt(i),i);
        }
        for (int i=0;i<words.length;++i){
            al1.add(words[i]);
        }
        String temp=al1.get(0);
        for (int i=1;i<al1.size();++i){
            String temp1=al1.get(i);
            int term=0,maxTerm=Math.min(temp.length(),temp1.length());
            while (term<maxTerm){
                if (hs.get(temp.charAt(term))>hs.get(temp1.charAt(term))){
                    return false;
                }
                else if (hs.get(temp.charAt(term))<hs.get(temp1.charAt(term))){
                    term=maxTerm;//直接结束这两个单词的对比
                }
                else if (term==maxTerm-1 && temp.length()>temp1.length()){
                    //到了最后一次循环，其中至少一个词到结尾了
                    //若前面的（本应该小的）比后面的长，且之前部分一样，这样前面的大
                    return false;
                }
                term++;
            }
            temp=temp1;
        }

        return true;
    }
}
