import java.util.ArrayList;
import java.util.Collections;

public class Leetcode888 {
    public static String[] uncommonFromSentences(String A, String B) {
        ArrayList<String> al=new ArrayList<>();
        String[] a=A.split(" ");
        String[] b=B.split(" ");
        ArrayList<String> ala=new ArrayList<>();
        for (int i=0;i<a.length;++i){
            ala.add(a[i]);
        }
        ArrayList<String> alb=new ArrayList<>();
        for (int i=0;i<b.length;++i){
            alb.add(b[i]);
        }
        Collections.sort(ala);
        Collections.sort(alb);
        int mark=0;
        for (int i=1;i<ala.size();++i){
            if (ala.get(i-1).equals(ala.get(i))){
                mark=1;
            }
            else if (!ala.get(i-1).equals(ala.get(i)) && mark==1){
                mark=0;
            }
            else {
                if (!alb.contains(ala.get(i-1))){
                    al.add(ala.get(i-1));
                }
            }
        }
        if (!alb.contains(ala.get(ala.size()-1)) && mark==0 && !al.contains(ala.get(ala.size()-1))){
            al.add(ala.get(ala.size()-1));
        }

        mark=0;
        if (alb.size()==1){
            if (!ala.contains(alb.get(0))){
                al.add(alb.get(0));
            }
        }
        for (int i=1;i<alb.size();++i){
            if (alb.get(i-1).equals(alb.get(i))){
                mark=1;
            }
            else if (!alb.get(i-1).equals(alb.get(i)) && mark==1){
                mark=0;
            }
            else {
                if (!ala.contains(alb.get(i-1))){
                    al.add(alb.get(i-1));
                }
            }
        }
        if (!ala.contains(alb.get(alb.size()-1)) && mark==0 && !al.contains(alb.get(alb.size()-1))){
            al.add(alb.get(alb.size()-1));
        }
        return al.toArray(new String[al.size()]);
    }
}
