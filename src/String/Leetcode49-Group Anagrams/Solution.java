import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len=strs.length,firstdiff=0;
        List<List<String>> result=new ArrayList<>();
        if (len==0)
            return result;
        ArrayList<Integer> added=new ArrayList<>();//辅助数组，用来标记string元素是否已经加入到结果集
        for (int i=0;i<len;++i){
            added.add(0);
        }

        while (added.contains(0)) {//每轮完成一个list<String>
            for (int i=0;i<len;++i){
                if (added.get(i)==0){
                    firstdiff=i;
                    break;
                }
            }//确定每轮firstdiff为第一个尚未加入的string元素
            List<String> one = new ArrayList<>();
            one.add(strs[firstdiff]);//先把第一个不同的加入新的list<String>，作为该轮比较基准
            added.set(firstdiff,1);//在added中对应下标标记1为已经加入

            char[] first = strs[firstdiff].toCharArray();

            for (int i = firstdiff+1; i < len; ++i) {
                char[] op = strs[i].toCharArray();

                if (isSame(first, op)) {
                    one.add(strs[i]);
                    added.set(i,1);
                }
            }
            result.add(one);
        }
        return result;
    }

    public boolean isSame(char[] model,char[] j){
        Arrays.sort(model);
        Arrays.sort(j);
        if (Arrays.equals(model,j)){
            return true;
        }
        else
            return false;
    }
}
