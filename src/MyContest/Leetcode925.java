import java.util.ArrayList;

public class Leetcode925 {
    public boolean isLongPressedName(String name, String typed) {
        ArrayList<Integer> name1=new ArrayList<>();
        ArrayList<Integer> typee1=new ArrayList<>();
        int count=1;
        for (int i=1;i<name.length();++i){
            if (name.charAt(i)==name.charAt(i-1)){
                count++;
            }
            else {
                name1.add(count);
                count=1;
            }
        }
        if (count!=0){
            name1.add(count);
            count=0;
        }
        count=1;
        for (int i=1;i<typed.length();++i){
            if (typed.charAt(i)==typed.charAt(i-1)){
                count++;
            }
            else {
                typee1.add(count);
                count=1;
            }
        }
        if (count!=0){
            typee1.add(count);
            count=0;
        }
        if (name1.size()!=typee1.size()){
            return false;
        }
        else {
            for (int i=0;i<name1.size();++i){
                if (name1.get(i)>typee1.get(i))
                    return false;
            }
        }
        return true;
    }
}
