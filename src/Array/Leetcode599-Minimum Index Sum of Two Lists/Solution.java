import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> hm1=new HashMap<>();
        HashMap<String,Integer> hm2=new HashMap<>();
        for (int i=0;i<list1.length;++i){
            hm1.put(list1[i],i);
        }
        for (int i=0;i<list2.length;++i){
            if (hm1.containsKey(list2[i]))
                hm2.put(list2[i],i+hm1.get(list2[i]));
        }
        Iterator<Map.Entry<String, Integer>> ite=hm2.entrySet().iterator();
        int minIndex=2000;
        String[] res=new String[1];
        ArrayList<String> al=new ArrayList<>();
        while (ite.hasNext()){
            Map.Entry entry=ite.next();
            Integer value= (Integer) entry.getValue();
            if (value<=minIndex){
                minIndex=value;
                res[0]= (String) entry.getKey();
            }
        }
        ite=hm2.entrySet().iterator();
        while (ite.hasNext()){
            Map.Entry entry=ite.next();
            Integer value= (Integer) entry.getValue();
            if (value==minIndex){
                al.add((String) entry.getKey());
            }
        }
        res= al.toArray(new String[al.size()]);
        return res;
    }
}
