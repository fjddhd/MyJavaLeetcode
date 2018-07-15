import java.util.ArrayList;

public class Solution868 {
    public int binaryGap(int N) {
        String bn=Integer.toBinaryString(N);
        StringBuilder sb=new StringBuilder("0b");
        sb.append(bn);
        bn=sb.toString();
        String[] ss=bn.split("1");
        ArrayList<String> al=new ArrayList<>();
        for (int i=0;i<ss.length;++i){
            al.add(ss[i]);
        }
        int mark=0;
        for (int i=1;i<bn.length();++i){
            if (bn.charAt(i)==bn.charAt(i-1) && bn.charAt(i)=='1')
                mark=1;
        }
        if (bn.charAt(bn.length()-1)=='1')
            al.add("0");
        int max=0;
        if (mark==1)
            max=1;
        for (int i=1;i<al.size()-1;++i){
            max=Math.max(max,al.get(i).length()+1);
            System.out.println("依次"+al.get(i));
        }
        System.out.println(bn);
        System.out.println(al.size());
        return max;
    }
}
