import java.util.*;

public class Solution {
    List<String> res=new ArrayList<>();
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> hm=new HashMap<>();
        for (int i=0;i<cpdomains.length;++i){
            String temp=cpdomains[i];
            String[] tempSpace=temp.split(" ");
            String[] tempPoint=tempSpace[1].split("\\.");//注意，分隔英文句号必须这样写

            StringBuilder operate=new StringBuilder();
            for (int j=tempPoint.length-1;j>=0;--j){
                StringBuilder sb=new StringBuilder(tempPoint[j]);
                if (j!=tempPoint.length-1) {
                    sb.append(".");
                }
                sb.append(operate);
                operate=sb;
                if (!hm.containsKey(operate.toString())) {
                    hm.put(operate.toString(),Integer.valueOf(tempSpace[0]));
                }
                else {
                    hm.put(operate.toString(),hm.get(operate.toString())+Integer.valueOf(tempSpace[0]));
                }
            }
        }
        combination(hm);
        return res;
    }
    public void combination(HashMap hm){
        Iterator<Map.Entry<String,Integer>> it=hm.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,Integer> entry=it.next();
            StringBuilder c_sb=new StringBuilder();
            c_sb.append(entry.getValue());
            c_sb.append(" ");
            c_sb.append(entry.getKey());
            res.add(c_sb.toString());
        }
    }
}
