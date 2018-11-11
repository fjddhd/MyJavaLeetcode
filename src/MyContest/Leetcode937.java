import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Leetcode937 {
    public static String[] reorderLogFiles(String[] logs) {
        ArrayList<String> alDig=new ArrayList<>();
        HashMap<String,String> hm=new HashMap();
        ArrayList<String> alCha=new ArrayList<>();
        String[] res=new String[logs.length];
        for(int i=0;i<logs.length;++i){
            String[] temp=logs[i].split(" ");
            if(temp[1].charAt(0)>='0' && temp[1].charAt(0)<='9'){
                alDig.add(logs[i]);
            }
            else {
                String[] temp1=logs[i].split(" ",2);
                hm.put(temp1[1],logs[i]);
                alCha.add(temp1[1]);
            }
        }
        Collections.sort(alCha);
        int m=0;
        for (m=0;m<alCha.size();++m){
            res[m]=hm.get(alCha.get(m));
        }
        for (int i=m;i<logs.length;++i){
            res[i]=alDig.get(i-m);
        }
        return res;
    }
}
